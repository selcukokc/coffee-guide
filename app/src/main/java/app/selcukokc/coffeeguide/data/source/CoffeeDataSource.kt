package app.selcukokc.coffeeguide.data.source

import app.selcukokc.coffeeguide.data.model.response.Coffee

interface CoffeeDataSource {
    suspend fun getHotCoffees(): List<Coffee>
    suspend fun getIcedCoffees(): List<Coffee>
}