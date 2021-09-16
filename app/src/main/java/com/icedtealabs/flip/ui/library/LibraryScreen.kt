package com.icedtealabs.flip.ui.library

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.icedtealabs.flip.ui.library.view.CardSetUi

@Composable
fun LibraryScreen(
    viewModel: LibraryViewModel
) {
    val state by viewModel.state.collectAsState()
    LibraryScreen(state = state)
}


@Composable
fun LibraryScreen(
    state: LibraryState
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        when (state) {
            is LibraryState.LoadFailed -> {
                item {
                    Text(
                        text = "Load library data failed!",
                        style = MaterialTheme.typography.body1,
                        color = Color.Red
                    )
                }
            }
            is LibraryState.LoadSuccess -> {
                items(state.cardSets.size) { index ->
                    CardSetUi(cardSet = state.cardSets[index])
                }
            }
            is LibraryState.Loading -> {
                item {
                    Text(
                        text = "Loading...",
                        style = MaterialTheme.typography.body1,
                    )
                }
            }
        }

    }
}

