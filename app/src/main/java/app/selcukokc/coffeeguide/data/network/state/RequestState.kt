package app.selcukokc.coffeeguide.data.network.state


sealed class RequestState<T>{
    class Loading<T>: RequestState<T>()
    data class Failure<T>(val message: String): RequestState<T>()
    data class Success<T>(val data: T): RequestState<T>()
}