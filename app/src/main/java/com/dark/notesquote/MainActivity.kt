package com.dark.notesquote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.dark.notesquote.ui.navigation.AppNavigation
import com.dark.notesquote.ui.theme.NotesQuoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retrieve Application class holding our dependencies container
        val appContainer = applicationContext as NotesQuoteApp

        setContent {
            val settingsState by appContainer.settingsRepository.settingsState.collectAsState()
            NotesQuoteTheme(settings = settingsState) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    AppNavigation(appContainer = appContainer)
                }
            }
        }
    }
}

