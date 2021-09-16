package com.icedtealabs.flip.ui.library

import com.icedtealabs.flip.ui.library.usecase.LoadCardSetsUseCase
import com.icedtealabs.flip.ui.library.usecase.LoadCardSetsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class LibraryScreenModule {
    @Binds
    abstract fun loadCardSetsUseCase(useCase: LoadCardSetsUseCaseImpl): LoadCardSetsUseCase
}

