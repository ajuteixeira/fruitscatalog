package br.unifor.sistemasolarapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.unifor.fruitscatalogapp.data.Fruit

@Composable
fun FruitCard(fruit: Fruit){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(fruit.photo),
            contentDescription = "Imagem da fruta ${fruit.name}",
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
                .padding(20.dp)
        )

        Text(
            text = fruit.name,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
}