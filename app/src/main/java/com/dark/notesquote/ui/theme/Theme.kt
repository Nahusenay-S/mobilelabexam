package com.dark.notesquote.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

import androidx.compose.ui.text.font.FontFamily
import com.dark.notesquote.data.repository.TypographySettings

private val DarkColorScheme = darkColorScheme(
    primary = GoldAccent,
    secondary = CoralAccent,
    tertiary = GoldAccentDark,
    background = Obsidian,
    surface = SlateDark,
    onPrimary = TextDark,
    onSecondary = TextDark,
    onBackground = TextLight,
    onSurface = TextLight
)

private val LightColorScheme = lightColorScheme(
    primary = GoldAccentDark,
    secondary = CoralAccent,
    tertiary = GoldAccent,
    background = LightBackground,
    surface = LightSurface,
    onPrimary = TextLight,
    onSecondary = TextDark,
    onBackground = TextDark,
    onSurface = TextDark
)

@Composable
fun NotesQuoteTheme(
    settings: TypographySettings = TypographySettings(),
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            window.navigationBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    val baseFontFamily = when (settings.fontFamilyType) {
        "Serif" -> FontFamily.Serif
        "Monospace" -> FontFamily.Monospace
        else -> FontFamily.SansSerif
    }
    val multiplier = settings.fontSizeMultiplier

    val adjustedTypography = androidx.compose.material3.Typography(
        headlineLarge = Typography.headlineLarge.copy(fontFamily = baseFontFamily, fontSize = Typography.headlineLarge.fontSize * multiplier),
        headlineMedium = Typography.headlineMedium.copy(fontFamily = baseFontFamily, fontSize = Typography.headlineMedium.fontSize * multiplier),
        titleLarge = Typography.titleLarge.copy(fontFamily = baseFontFamily, fontSize = Typography.titleLarge.fontSize * multiplier),
        titleMedium = Typography.titleMedium.copy(fontFamily = baseFontFamily, fontSize = Typography.titleMedium.fontSize * multiplier),
        bodyLarge = Typography.bodyLarge.copy(fontFamily = baseFontFamily, fontSize = Typography.bodyLarge.fontSize * multiplier),
        bodyMedium = Typography.bodyMedium.copy(fontFamily = baseFontFamily, fontSize = Typography.bodyMedium.fontSize * multiplier),
        labelMedium = Typography.labelMedium.copy(fontFamily = baseFontFamily, fontSize = Typography.labelMedium.fontSize * multiplier)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = adjustedTypography,
        content = content
    )
}

