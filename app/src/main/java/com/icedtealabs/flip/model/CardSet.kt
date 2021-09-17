package com.icedtealabs.flip.model

data class CardSet(
    val id: String,
    val name: String,
    val photo: String = "",
    val noCards: Int = 0,
)
