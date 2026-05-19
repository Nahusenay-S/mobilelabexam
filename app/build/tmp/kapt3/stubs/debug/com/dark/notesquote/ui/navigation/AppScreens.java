package com.dark.notesquote.ui.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/dark/notesquote/ui/navigation/AppScreens;", "", "()V", "ADD_EDIT_NOTE", "", "DASHBOARD", "NOTE_DETAIL", "SETTINGS", "addEditNoteRoute", "noteId", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "noteDetailRoute", "app_debug"})
public final class AppScreens {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DASHBOARD = "dashboard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTE_DETAIL = "note_detail/{noteId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_EDIT_NOTE = "add_edit_note?noteId={noteId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SETTINGS = "settings";
    @org.jetbrains.annotations.NotNull()
    public static final com.dark.notesquote.ui.navigation.AppScreens INSTANCE = null;
    
    private AppScreens() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String noteDetailRoute(int noteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String addEditNoteRoute(@org.jetbrains.annotations.Nullable()
    java.lang.Integer noteId) {
        return null;
    }
}