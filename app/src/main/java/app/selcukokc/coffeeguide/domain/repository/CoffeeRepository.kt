package app.selcukokc.coffeeguide.domain.repository

import app.selcukokc.coffeeguide.data.model.response.Coffee

interface CoffeeRepository {

    suspend fun getHotCoffees(): List<Coffee>
    suspend fun getIcedCoffees(): List<Coffee>

}