package app.selcukokc.coffeeguide.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.selcukokc.coffeeguide.presentation.mainscreen.MainScreen
import app.selcukokc.coffeeguide.presentation.ui.theme.CoffeeGuideTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CoffeeGuideTheme {
                MainScreen()
            }
        }

    }
}

