package com.dark.notesquote.ui.screens.settings

import androidx.lifecycle.ViewModel
import com.dark.notesquote.data.repository.SettingsRepository
import com.dark.notesquote.data.repository.TypographySettings
import kotlinx.coroutines.flow.StateFlow

class SettingsViewModel(
    private val settingsRepository: SettingsRepository
) : ViewModel() {

    val settingsState: StateFlow<TypographySettings> = settingsRepository.settingsState

    fun updateFontSize(multiplier: Float) {
        settingsRepository.updateFontSizeMultiplier(multiplier)
    }

    fun updateFontStyle(style: String) {
        settingsRepository.updateFontFamilyType(style)
    }
}
