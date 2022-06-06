package app.selcukokc.coffeeguide.presentation.coffeelist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import app.selcukokc.coffeeguide.presentation.base.BaseViewModel
import app.selcukokc.coffeeguide.presentation.components.CoffeeItem

@Composable
fun CoffeeListScreen(viewModel: BaseViewModel<CoffeeListState>){

    val state = viewModel.viewState.value

    if(state.isLoading){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }

    if(state.error.isNotBlank()) {
        Text(
            text = state.error,
            color = MaterialTheme.colors.error,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
    }

    LazyColumn{
        items(state.coffees ?: listOf()){ coffee ->
            CoffeeItem(coffee = coffee)
        }
    }


}