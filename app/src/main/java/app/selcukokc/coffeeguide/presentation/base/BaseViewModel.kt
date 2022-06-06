package app.selcukokc.coffeeguide.presentation.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<ViewState: IViewState>: ViewModel() {

    private val initialState: ViewState by lazy { createInitialState() }
    abstract fun createInitialState(): ViewState

    private val _viewState: MutableState<ViewState> = mutableStateOf(initialState)
    val viewState: State<ViewState> = _viewState

    protected fun setState(state: ViewState){
        _viewState.value = state
    }

}