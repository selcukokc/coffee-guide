package app.selcukokc.coffeeguide.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import app.selcukokc.coffeeguide.presentation.ui.theme.Brown

@Composable
fun IngredientChip(
    text: String,
) {
    Surface(
        color = Color.Transparent,
        contentColor = Color.DarkGray,
        shape = CircleShape,
        border = BorderStroke(
            width = 1.dp,
            color = Color.LightGray
        )
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            color = Brown,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(14.dp)
        )
    }
}