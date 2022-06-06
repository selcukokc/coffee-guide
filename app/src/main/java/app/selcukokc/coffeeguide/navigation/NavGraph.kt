package app.selcukokc.coffeeguide.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.selcukokc.coffeeguide.presentation.coffeelist.CoffeeListScreen
import app.selcukokc.coffeeguide.presentation.coffeelist.HotCoffeeListVM
import app.selcukokc.coffeeguide.presentation.coffeelist.IcedCoffeeListVM

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.HotCoffees.route
    ){
        composable(route = Screen.HotCoffees.route){
            val viewModel: HotCoffeeListVM = hiltViewModel()
            CoffeeListScreen(viewModel)
        }

        composable(route = Screen.IcedCoffees.route){
            val viewModel: IcedCoffeeListVM = hiltViewModel()
            CoffeeListScreen(viewModel)
        }
    }
}