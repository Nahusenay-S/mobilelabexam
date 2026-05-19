package com.dark.notesquote

import android.app.Application
import com.dark.notesquote.data.database.NoteDatabase
import com.dark.notesquote.data.network.QuoteApiService
import com.dark.notesquote.data.repository.NoteRepository
import com.dark.notesquote.data.repository.QuoteRepository
import com.dark.notesquote.data.repository.SettingsRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NotesQuoteApp : Application() {

    // Database & Note Repository
    lateinit var noteDatabase: NoteDatabase
        private set
    lateinit var noteRepository: NoteRepository
        private set

    // Retrofit & Quote Repository
    lateinit var quoteApiService: QuoteApiService
        private set
    lateinit var quoteRepository: QuoteRepository
        private set

    // Settings Repository
    lateinit var settingsRepository: SettingsRepository
        private set

    override fun onCreate() {
        super.onCreate()

        // 1. Initialize local SQLite Database
        noteDatabase = NoteDatabase.getDatabase(this)
        noteRepository = NoteRepository(noteDatabase.noteDao())

        // 2. Initialize Settings Repository
        settingsRepository = SettingsRepository(this)

        // 3. Initialize remote Quote API Client
        val retrofit = Retrofit.Builder()
            .baseUrl(QuoteApiService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        quoteApiService = retrofit.create(QuoteApiService::class.java)
        quoteRepository = QuoteRepository(quoteApiService)
    }
}

