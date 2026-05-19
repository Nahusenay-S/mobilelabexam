package com.dark.notesquote.ui.screens.add_edit_note

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dark.notesquote.data.model.NoteEntity
import com.dark.notesquote.data.repository.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AddEditNoteViewModel(
    private val noteRepository: NoteRepository,
    private val noteId: Int?
) : ViewModel() {

    private val _title = MutableStateFlow("")
    val title: StateFlow<String> = _title.asStateFlow()

    private val _content = MutableStateFlow("")
    val content: StateFlow<String> = _content.asStateFlow()

    private val _isTitleError = MutableStateFlow(false)
    val isTitleError: StateFlow<Boolean> = _isTitleError.asStateFlow()

    private val _isSaveSuccess = MutableStateFlow(false)
    val isSaveSuccess: StateFlow<Boolean> = _isSaveSuccess.asStateFlow()

    init {
        if (noteId != null && noteId != -1) {
            loadNoteForEditing(noteId)
        }
    }

    private fun loadNoteForEditing(id: Int) {
        viewModelScope.launch {
            val note = noteRepository.getNoteById(id)
            if (note != null) {
                _title.value = note.title
                _content.value = note.content
            }
        }
    }

    fun onTitleChanged(newTitle: String) {
        _title.value = newTitle
        if (newTitle.isNotBlank()) {
            _isTitleError.value = false
        }
    }

    fun onContentChanged(newContent: String) {
        _content.value = newContent
    }

    fun saveNote() {
        val currentTitle = _title.value
        val currentContent = _content.value

        if (currentTitle.isBlank()) {
            _isTitleError.value = true
            return
        }

        viewModelScope.launch {
            val note = if (noteId != null && noteId != -1) {
                NoteEntity(id = noteId, title = currentTitle, content = currentContent, timestamp = System.currentTimeMillis())
            } else {
                NoteEntity(title = currentTitle, content = currentContent, timestamp = System.currentTimeMillis())
            }
            noteRepository.saveNote(note)
            _isSaveSuccess.value = true
        }
    }
}
