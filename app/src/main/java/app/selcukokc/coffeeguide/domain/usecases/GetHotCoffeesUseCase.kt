package app.selcukokc.coffeeguide.domain.usecases

import app.selcukokc.coffeeguide.data.model.response.Coffee
import app.selcukokc.coffeeguide.data.network.state.RequestState
import app.selcukokc.coffeeguide.domain.repository.CoffeeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception
import javax.inject.Inject

class GetHotCoffeesUseCase @Inject constructor(
    private val coffeeRepository: CoffeeRepository
) {

    operator fun invoke(): Flow<RequestState<List<Coffee>>> = flow {

        try {
            emit(RequestState.Loading<List<Coffee>>())
            val catBreeds = coffeeRepository.getHotCoffees()
            emit(RequestState.Success<List<Coffee>>(catBreeds))
        } catch (e: Exception){
            emit(RequestState.Failure<List<Coffee>>(e.localizedMessage ?: "An unexpected error occurred"))
        }

    }.flowOn(Dispatchers.IO)

}