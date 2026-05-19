package com.dark.notesquote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/dark/notesquote/NotesQuoteApp;", "Landroid/app/Application;", "()V", "<set-?>", "Lcom/dark/notesquote/data/database/NoteDatabase;", "noteDatabase", "getNoteDatabase", "()Lcom/dark/notesquote/data/database/NoteDatabase;", "Lcom/dark/notesquote/data/repository/NoteRepository;", "noteRepository", "getNoteRepository", "()Lcom/dark/notesquote/data/repository/NoteRepository;", "Lcom/dark/notesquote/data/network/QuoteApiService;", "quoteApiService", "getQuoteApiService", "()Lcom/dark/notesquote/data/network/QuoteApiService;", "Lcom/dark/notesquote/data/repository/QuoteRepository;", "quoteRepository", "getQuoteRepository", "()Lcom/dark/notesquote/data/repository/QuoteRepository;", "Lcom/dark/notesquote/data/repository/SettingsRepository;", "settingsRepository", "getSettingsRepository", "()Lcom/dark/notesquote/data/repository/SettingsRepository;", "onCreate", "", "app_debug"})
public final class NotesQuoteApp extends android.app.Application {
    private com.dark.notesquote.data.database.NoteDatabase noteDatabase;
    private com.dark.notesquote.data.repository.NoteRepository noteRepository;
    private com.dark.notesquote.data.network.QuoteApiService quoteApiService;
    private com.dark.notesquote.data.repository.QuoteRepository quoteRepository;
    private com.dark.notesquote.data.repository.SettingsRepository settingsRepository;
    
    public NotesQuoteApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dark.notesquote.data.database.NoteDatabase getNoteDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dark.notesquote.data.repository.NoteRepository getNoteRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dark.notesquote.data.network.QuoteApiService getQuoteApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dark.notesquote.data.repository.QuoteRepository getQuoteRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dark.notesquote.data.repository.SettingsRepository getSettingsRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
}