package com.dark.notesquote.data.network

import com.dark.notesquote.data.model.QuoteResponse
import retrofit2.http.GET

interface QuoteApiService {
    @GET("random")
    suspend fun getRandomQuote(): QuoteResponse

    companion object {
        const val BASE_URL = "https://api.quotable.io/"
    }
}
