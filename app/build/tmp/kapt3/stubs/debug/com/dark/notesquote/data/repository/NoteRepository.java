package com.dark.notesquote.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dark/notesquote/data/repository/NoteRepository;", "", "noteDao", "Lcom/dark/notesquote/data/database/NoteDao;", "(Lcom/dark/notesquote/data/database/NoteDao;)V", "deleteNote", "", "note", "Lcom/dark/notesquote/data/model/NoteEntity;", "(Lcom/dark/notesquote/data/model/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNoteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNote", "app_debug"})
public final class NoteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.database.NoteDao noteDao = null;
    
    public NoteRepository(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.database.NoteDao noteDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dark.notesquote.data.model.NoteEntity>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNoteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dark.notesquote.data.model.NoteEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveNote(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.model.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.model.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}