package com.icedtealabs.flip.ui.library

import com.icedtealabs.flip.model.CardSet
import java.lang.Exception

sealed class LibraryState(
    open val cardSets: List<CardSet> = emptyList()
) {
    data class Loading(
        override val cardSets: List<CardSet> = emptyList()
    ) : LibraryState()

    data class LoadSuccess(
        override val cardSets: List<CardSet> = emptyList()
    ) : LibraryState()

    data class LoadFailed(
        val exception: Exception
    ) : LibraryState(cardSets = emptyList())
}
