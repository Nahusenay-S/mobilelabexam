package com.dark.notesquote.ui.screens.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a6\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a(\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u00a8\u0006\u001c"}, d2 = {"DashboardScreen", "", "viewModel", "Lcom/dark/notesquote/ui/screens/dashboard/DashboardViewModel;", "onNoteClick", "Lkotlin/Function1;", "", "onAddNoteClick", "Lkotlin/Function0;", "onSettingsClick", "modifier", "Landroidx/compose/ui/Modifier;", "NoteCard", "note", "Lcom/dark/notesquote/data/model/NoteEntity;", "onClick", "onFavoriteClick", "QuoteCard", "state", "Lcom/dark/notesquote/ui/screens/dashboard/QuoteUiState;", "onRefreshClick", "QuoteContent", "quote", "Lcom/dark/notesquote/data/model/Quote;", "formatNoteDate", "", "timestamp", "", "app_debug"})
public final class DashboardScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void DashboardScreen(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.ui.screens.dashboard.DashboardViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onNoteClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddNoteClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSettingsClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QuoteCard(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.ui.screens.dashboard.QuoteUiState state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefreshClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QuoteContent(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.model.Quote quote) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void NoteCard(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.model.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavoriteClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatNoteDate(long timestamp) {
        return null;
    }
}