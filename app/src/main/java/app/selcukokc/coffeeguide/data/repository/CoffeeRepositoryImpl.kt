package app.selcukokc.coffeeguide.data.repository

import app.selcukokc.coffeeguide.data.source.CoffeeDataSource
import app.selcukokc.coffeeguide.domain.repository.CoffeeRepository
import javax.inject.Inject

class CoffeeRepositoryImpl @Inject constructor(
    private val coffeeDataSource: CoffeeDataSource,
): CoffeeRepository {

    override suspend fun getHotCoffees() = coffeeDataSource.getHotCoffees()
    override suspend fun getIcedCoffees() = coffeeDataSource.getIcedCoffees()

}