package com.dark.notesquote.data.repository

import com.dark.notesquote.data.database.NoteDao
import com.dark.notesquote.data.model.NoteEntity
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDao) {
    fun getAllNotes(): Flow<List<NoteEntity>> = noteDao.getAllNotesFlow()

    suspend fun getNoteById(id: Int): NoteEntity? = noteDao.getNoteById(id)

    suspend fun saveNote(note: NoteEntity) = noteDao.insertNote(note)

    suspend fun deleteNote(note: NoteEntity) = noteDao.deleteNote(note)
}
