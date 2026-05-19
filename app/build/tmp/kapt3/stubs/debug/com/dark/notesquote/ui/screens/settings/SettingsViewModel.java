package com.dark.notesquote.ui.screens.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/dark/notesquote/ui/screens/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "settingsRepository", "Lcom/dark/notesquote/data/repository/SettingsRepository;", "(Lcom/dark/notesquote/data/repository/SettingsRepository;)V", "settingsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/dark/notesquote/data/repository/TypographySettings;", "getSettingsState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateFontSize", "", "multiplier", "", "updateFontStyle", "style", "", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.repository.SettingsRepository settingsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.data.repository.TypographySettings> settingsState = null;
    
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.repository.SettingsRepository settingsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.data.repository.TypographySettings> getSettingsState() {
        return null;
    }
    
    public final void updateFontSize(float multiplier) {
    }
    
    public final void updateFontStyle(@org.jetbrains.annotations.NotNull()
    java.lang.String style) {
    }
}