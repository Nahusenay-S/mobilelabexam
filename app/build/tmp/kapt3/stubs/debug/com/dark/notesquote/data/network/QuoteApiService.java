package com.dark.notesquote.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/dark/notesquote/data/network/QuoteApiService;", "", "getRandomQuote", "Lcom/dark/notesquote/data/model/QuoteResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface QuoteApiService {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.quotable.io/";
    @org.jetbrains.annotations.NotNull()
    public static final com.dark.notesquote.data.network.QuoteApiService.Companion Companion = null;
    
    @retrofit2.http.GET(value = "random")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomQuote(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dark.notesquote.data.model.QuoteResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dark/notesquote/data/network/QuoteApiService$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.quotable.io/";
        
        private Companion() {
            super();
        }
    }
}