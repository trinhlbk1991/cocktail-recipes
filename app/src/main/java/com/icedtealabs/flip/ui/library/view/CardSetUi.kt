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
import com.icedtealabs.flip.ui.theme.CARD_ELEVATION
import com.icedtealabs.flip.ui.theme.SPACE_16

@Composable
fun CardSetUi(cardSet: CardSet) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { },
        elevation = CARD_ELEVATION
    ) {
        Column(
            modifier = Modifier.padding(SPACE_16)
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
