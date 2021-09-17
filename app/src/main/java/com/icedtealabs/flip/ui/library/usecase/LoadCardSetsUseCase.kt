package com.icedtealabs.flip.ui.library.usecase

import com.icedtealabs.flip.model.CardSet
import javax.inject.Inject

interface LoadCardSetsUseCase {
    suspend operator fun invoke(): List<CardSet>
}

class LoadCardSetsUseCaseImpl @Inject constructor() : LoadCardSetsUseCase {

    override suspend fun invoke(): List<CardSet> {
        return listOf(
            CardSet(id = "1", name = "Easy English", noCards = 11),
            CardSet(id = "2", name = "Medium English", noCards = 11),
            CardSet(id = "3", name = "Advanced English", noCards = 11),
            CardSet(id = "4", name = "Advanced English 2", noCards = 11),
        )
    }

}
