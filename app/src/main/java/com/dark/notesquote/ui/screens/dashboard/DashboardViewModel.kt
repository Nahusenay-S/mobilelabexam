package com.dark.notesquote.ui.screens.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dark.notesquote.data.model.NoteEntity
import com.dark.notesquote.data.model.Quote
import com.dark.notesquote.data.repository.NoteRepository
import com.dark.notesquote.data.repository.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

sealed interface QuoteUiState {
    object Loading : QuoteUiState
    data class Success(val quote: Quote) : QuoteUiState
    data class Error(val message: String) : QuoteUiState
}

class DashboardViewModel(
    private val noteRepository: NoteRepository,
    private val quoteRepository: QuoteRepository
) : ViewModel() {

    private val _quoteState = MutableStateFlow<QuoteUiState>(QuoteUiState.Loading)
    val quoteState: StateFlow<QuoteUiState> = _quoteState.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    // Combine notes list with search query for real-time reactive filtering and favorite pinning
    val notesState: StateFlow<List<NoteEntity>> = noteRepository.getAllNotes()
        .combine(_searchQuery) { notes, query ->
            val filtered = if (query.isBlank()) {
                notes
            } else {
                notes.filter { note ->
                    note.title.contains(query, ignoreCase = true) ||
                            note.content.contains(query, ignoreCase = true)
                }
            }
            // Favorites always pinned to the top, sorted by timestamp newest first inside groups
            filtered.sortedWith(
                compareByDescending<NoteEntity> { it.isFavorite }
                    .thenByDescending { it.timestamp }
            )
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    init {
        fetchQuote()
    }

    fun fetchQuote() {
        viewModelScope.launch {
            _quoteState.value = QuoteUiState.Loading
            try {
                val quote = quoteRepository.getRandomQuote()
                _quoteState.value = QuoteUiState.Success(quote)
            } catch (e: Exception) {
                _quoteState.value = QuoteUiState.Error(e.localizedMessage ?: "Unknown Error")
            }
        }
    }

    fun onSearchQueryChanged(newQuery: String) {
        _searchQuery.value = newQuery
    }

    fun toggleFavorite(note: NoteEntity) {
        viewModelScope.launch {
            noteRepository.saveNote(note.copy(isFavorite = !note.isFavorite))
        }
    }
}

