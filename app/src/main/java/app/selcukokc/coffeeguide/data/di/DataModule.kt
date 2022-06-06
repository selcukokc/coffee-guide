package app.selcukokc.coffeeguide.data.di

import app.selcukokc.coffeeguide.data.network.api.CoffeeService
import app.selcukokc.coffeeguide.data.repository.CatBreedsRepositoryImpl
import app.selcukokc.coffeeguide.data.source.CoffeeDataSource
import app.selcukokc.coffeeguide.data.source.CoffeeDataSourceImpl
import app.selcukokc.coffeeguide.domain.repository.CoffeeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object DataModule {

    @Provides
    fun provideCatBreedsDataSource(catBreedsService: CoffeeService): CoffeeDataSource =
        CoffeeDataSourceImpl(catBreedsService)

    @Provides
    fun provideCatBreedsRepository(catBreedsDataSource: CoffeeDataSource): CoffeeRepository =
        CatBreedsRepositoryImpl(catBreedsDataSource)

}