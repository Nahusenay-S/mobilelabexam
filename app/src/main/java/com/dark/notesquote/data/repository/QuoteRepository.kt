package com.dark.notesquote.data.repository

import com.dark.notesquote.data.model.Quote
import com.dark.notesquote.data.network.QuoteApiService

class QuoteRepository(private val apiService: QuoteApiService) {
    
    suspend fun getRandomQuote(): Quote {
        return try {
            val response = apiService.getRandomQuote()
            Quote(content = response.content, author = response.author)
        } catch (e: Exception) {
            getOfflineFallbackQuote()
        }
    }

    private fun getOfflineFallbackQuote(): Quote {
        val fallbacks = listOf(
            Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
            Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"),
            Quote("It always seems impossible until it's done.", "Nelson Mandela"),
            Quote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill"),
            Quote("Keep your face always toward the sunshine—and shadows will fall behind you.", "Walt Whitman"),
            Quote("The secret of getting ahead is getting started.", "Mark Twain"),
            Quote("Warm, premium designs make user interfaces feel alive and engaging.", "Material Design Guide"),
            Quote("Focus on the journey, not the destination. Joy is found in the doing.", "Greg Anderson")
        )
        return fallbacks.random()
    }
}
