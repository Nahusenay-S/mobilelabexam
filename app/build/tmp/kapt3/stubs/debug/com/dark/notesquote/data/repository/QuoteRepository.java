package com.dark.notesquote.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dark/notesquote/data/repository/QuoteRepository;", "", "apiService", "Lcom/dark/notesquote/data/network/QuoteApiService;", "(Lcom/dark/notesquote/data/network/QuoteApiService;)V", "getOfflineFallbackQuote", "Lcom/dark/notesquote/data/model/Quote;", "getRandomQuote", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.dark.notesquote.data.network.QuoteApiService apiService = null;
    
    public QuoteRepository(@org.jetbrains.annotations.NotNull()
    com.dark.notesquote.data.network.QuoteApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRandomQuote(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dark.notesquote.data.model.Quote> $completion) {
        return null;
    }
    
    private final com.dark.notesquote.data.model.Quote getOfflineFallbackQuote() {
        return null;
    }
}