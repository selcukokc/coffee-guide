package app.selcukokc.coffeeguide.data.network.api

import app.selcukokc.coffeeguide.data.model.response.Coffee
import app.selcukokc.coffeeguide.util.Constants.HOT_COFFEES_ENDPOINT
import app.selcukokc.coffeeguide.util.Constants.ICED_COFFEES_ENDPOINT
import retrofit2.http.GET

interface CoffeeService {

    @GET(HOT_COFFEES_ENDPOINT)
    suspend fun getHotCoffees(): List<Coffee>

    @GET(ICED_COFFEES_ENDPOINT)
    suspend fun getIcedCoffees(): List<Coffee>

}