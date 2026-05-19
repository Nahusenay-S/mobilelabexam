package com.dark.notesquote.ui.screens.note_detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/dark/notesquote/ui/screens/note_detail/NoteDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "noteRepository", "Lcom/dark/notesquote/data/repository/NoteRepository;", "noteId", "", "(Lcom/dark/notesquote/data/repository/NoteRepository;I)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dark/notesquote/ui/screens/note_detail/NoteDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteNote", "", "onComplete", "Lkotlin/Function0;", "loadNote", "toggleFavorite", "app_debug"})
public final class NoteDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.repository.NoteRepository noteRepository = null;
    private final int noteId = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dark.notesquote.ui.screens.note_detail.NoteDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.ui.screens.note_detail.NoteDetailUiState> uiState = null;
    
    public NoteDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.repository.NoteRepository noteRepository, int noteId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.dark.notesquote.ui.screens.note_detail.NoteDetailUiState> getUiState() {
        return null;
    }
    
    public final void loadNote() {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final void toggleFavorite() {
    }
}