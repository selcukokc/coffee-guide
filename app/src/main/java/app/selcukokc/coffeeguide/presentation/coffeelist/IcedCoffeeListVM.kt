package app.selcukokc.coffeeguide.presentation.coffeelist

import androidx.lifecycle.viewModelScope
import app.selcukokc.coffeeguide.data.network.state.RequestState
import app.selcukokc.coffeeguide.domain.usecases.GetIcedCoffeesUseCase
import app.selcukokc.coffeeguide.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class IcedCoffeeListVM @Inject constructor(
    private val getIcedCoffeesUseCase: GetIcedCoffeesUseCase
): BaseViewModel<CoffeeListState>() {

    override fun createInitialState() = CoffeeListState(coffees = emptyList())

    init {
        getIcedCoffees()
    }

    private fun getIcedCoffees(){

        getIcedCoffeesUseCase().onEach { result->

            when(result) {

                is RequestState.Loading -> {
                    setState(CoffeeListState(isLoading = true))
                }
                is RequestState.Success -> {
                    setState(CoffeeListState(coffees = result.data ?: emptyList()))
                }
                is RequestState.Failure -> {
                    setState(CoffeeListState(error = result.message ?: "An unexpected error occurred"))
                }

            }

        }.launchIn(viewModelScope)

    }



}