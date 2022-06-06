package app.selcukokc.coffeeguide.presentation.coffeelist

import app.selcukokc.coffeeguide.data.model.response.Coffee
import app.selcukokc.coffeeguide.presentation.base.IViewState

data class CoffeeListState(
    val isLoading: Boolean = false,
    val coffees: List<Coffee>? = emptyList(),
    val error: String = ""
): IViewState