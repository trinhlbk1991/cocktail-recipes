package com.icedtealabs.flip.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<State> : ViewModel() {
    private val _state by lazy { MutableStateFlow(initState) }
    val state: StateFlow<State> = _state.asStateFlow()

    abstract val initState: State

    protected fun setState(state: State) {
        _state.value = state
    }
}
