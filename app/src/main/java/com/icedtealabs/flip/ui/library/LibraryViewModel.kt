package com.icedtealabs.flip.ui.library

import androidx.lifecycle.viewModelScope
import com.icedtealabs.flip.base.BaseViewModel
import com.icedtealabs.flip.ui.library.usecase.LoadCardSetsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LibraryViewModel @Inject constructor(
    private val loadCardSets: LoadCardSetsUseCase,
) : BaseViewModel<LibraryState>() {

    init {
        loadData()
    }

    override val initState: LibraryState
        get() = LibraryState.Loading()

    private fun loadData() = viewModelScope.launch {
        setState(LibraryState.Loading())

        val cardSets = loadCardSets()
        setState(LibraryState.LoadSuccess(cardSets))
    }
}
