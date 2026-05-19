package com.dark.notesquote.ui.screens.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/dark/notesquote/ui/screens/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "noteRepository", "Lcom/dark/notesquote/data/repository/NoteRepository;", "quoteRepository", "Lcom/dark/notesquote/data/repository/QuoteRepository;", "(Lcom/dark/notesquote/data/repository/NoteRepository;Lcom/dark/notesquote/data/repository/QuoteRepository;)V", "_quoteState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dark/notesquote/ui/screens/dashboard/QuoteUiState;", "_searchQuery", "", "notesState", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/dark/notesquote/data/model/NoteEntity;", "getNotesState", "()Lkotlinx/coroutines/flow/StateFlow;", "quoteState", "getQuoteState", "searchQuery", "getSearchQuery", "fetchQuote", "", "onSearchQueryChanged", "newQuery", "toggleFavorite", "note", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.repository.NoteRepository noteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.repository.QuoteRepository quoteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dark.notesquote.ui.screens.dashboard.QuoteUiState> _quoteState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.ui.screens.dashboard.QuoteUiState> quoteState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.dark.notesquote.data.model.NoteEntity>> notesState = null;
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.repository.NoteRepository noteRepository, @org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.repository.QuoteRepository quoteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.ui.screens.dashboard.QuoteUiState> getQuoteState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.dark.notesquote.data.model.NoteEntity>> getNotesState() {
        return null;
    }
    
    public final void fetchQuote() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String newQuery) {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.model.NoteEntity note) {
    }
}