package app.selcukokc.coffeeguide.data.source

import app.selcukokc.coffeeguide.data.network.api.CoffeeService
import javax.inject.Inject

class CoffeeDataSourceImpl @Inject constructor(
    private val coffeeService: CoffeeService
): CoffeeDataSource {

    override suspend fun getHotCoffees() = coffeeService.getHotCoffees()
    override suspend fun getIcedCoffees() = coffeeService.getIcedCoffees()

}