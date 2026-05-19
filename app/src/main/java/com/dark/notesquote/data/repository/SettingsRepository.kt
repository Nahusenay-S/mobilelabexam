package com.dark.notesquote.data.repository

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class TypographySettings(
    val fontSizeMultiplier: Float = 1.0f, // 0.85f = Small, 1.0f = Medium, 1.25f = Large
    val fontFamilyType: String = "SansSerif" // "SansSerif", "Serif", "Monospace"
) {
    val fontSizeName: String
        get() = when (fontSizeMultiplier) {
            0.85f -> "Small"
            1.25f -> "Large"
            else -> "Medium"
        }
}

class SettingsRepository(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("settings_prefs", Context.MODE_PRIVATE)

    private val _settingsState = MutableStateFlow(loadSettings())
    val settingsState: StateFlow<TypographySettings> = _settingsState.asStateFlow()

    private fun loadSettings(): TypographySettings {
        val multiplier = prefs.getFloat("font_size_multiplier", 1.0f)
        val style = prefs.getString("font_family_type", "SansSerif") ?: "SansSerif"
        return TypographySettings(multiplier, style)
    }

    fun updateFontSizeMultiplier(multiplier: Float) {
        prefs.edit().putFloat("font_size_multiplier", multiplier).apply()
        _settingsState.value = _settingsState.value.copy(fontSizeMultiplier = multiplier)
    }

    fun updateFontFamilyType(style: String) {
        prefs.edit().putString("font_family_type", style).apply()
        _settingsState.value = _settingsState.value.copy(fontFamilyType = style)
    }
}
