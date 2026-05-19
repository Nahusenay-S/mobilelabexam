package com.dark.notesquote.ui.screens.note_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dark.notesquote.data.model.NoteEntity
import com.dark.notesquote.data.repository.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed interface NoteDetailUiState {
    object Loading : NoteDetailUiState
    data class Success(val note: NoteEntity) : NoteDetailUiState
    object NotFound : NoteDetailUiState
}

class NoteDetailViewModel(
    private val noteRepository: NoteRepository,
    private val noteId: Int
) : ViewModel() {

    private val _uiState = MutableStateFlow<NoteDetailUiState>(NoteDetailUiState.Loading)
    val uiState: StateFlow<NoteDetailUiState> = _uiState.asStateFlow()

    init {
        loadNote()
    }

    fun loadNote() {
        viewModelScope.launch {
            _uiState.value = NoteDetailUiState.Loading
            val note = noteRepository.getNoteById(noteId)
            if (note != null) {
                _uiState.value = NoteDetailUiState.Success(note)
            } else {
                _uiState.value = NoteDetailUiState.NotFound
            }
        }
    }

    fun deleteNote(onComplete: () -> Unit) {
        val currentState = _uiState.value
        if (currentState is NoteDetailUiState.Success) {
            viewModelScope.launch {
                noteRepository.deleteNote(currentState.note)
                onComplete()
            }
        }
    }

    fun toggleFavorite() {
        val currentState = _uiState.value
        if (currentState is NoteDetailUiState.Success) {
            viewModelScope.launch {
                val updatedNote = currentState.note.copy(isFavorite = !currentState.note.isFavorite)
                noteRepository.saveNote(updatedNote)
                _uiState.value = NoteDetailUiState.Success(updatedNote)
            }
        }
    }
}

