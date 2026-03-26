package br.unifor.fruitscatalogapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import br.unifor.fruitscatalogapp.data.FruitsDatabase

@Composable
fun FruitsList(innerPadding: PaddingValues){
    val fruits = FruitsDatabase.getFruits()
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        item {
            Text(
                "Catálogo de frutas",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        items(fruits){ fruit ->
           FruitCard(fruit)
        }
    }
}