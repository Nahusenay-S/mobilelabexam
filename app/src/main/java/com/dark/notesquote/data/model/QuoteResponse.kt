package com.dark.notesquote.data.model

import com.google.gson.annotations.SerializedName

data class QuoteResponse(
    @SerializedName("content") val content: String,
    @SerializedName("author") val author: String
)
