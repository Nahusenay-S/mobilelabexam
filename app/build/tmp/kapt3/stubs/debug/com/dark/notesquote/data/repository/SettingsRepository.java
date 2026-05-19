package com.dark.notesquote.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/dark/notesquote/data/repository/SettingsRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_settingsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dark/notesquote/data/repository/TypographySettings;", "prefs", "Landroid/content/SharedPreferences;", "settingsState", "Lkotlinx/coroutines/flow/StateFlow;", "getSettingsState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadSettings", "updateFontFamilyType", "", "style", "", "updateFontSizeMultiplier", "multiplier", "", "app_debug"})
public final class SettingsRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dark.notesquote.data.repository.TypographySettings> _settingsState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.data.repository.TypographySettings> settingsState = null;
    
    public SettingsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.data.repository.TypographySettings> getSettingsState() {
        return null;
    }
    
    private final com.dark.notesquote.data.repository.TypographySettings loadSettings() {
        return null;
    }
    
    public final void updateFontSizeMultiplier(float multiplier) {
    }
    
    public final void updateFontFamilyType(@org.jetbrains.annotations.NotNull()
    java.lang.String style) {
    }
}