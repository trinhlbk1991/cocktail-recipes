package com.icedtealabs.flip.ui.library.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.icedtealabs.flip.model.CardSet
import com.icedtealabs.flip.ui.BottomNavigationBar

@Composable
fun CardSetUi(cardSet: CardSet) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable { },
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                text = cardSet.name,
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    CardSetUi(cardSet = CardSet(id = "1", name = "Hello World"))
}
