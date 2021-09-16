package com.icedtealabs.flip.ui.settings

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingsScreen(
    // homeViewModel: HomeViewModel,
    // navigateToArticle: (String) -> Unit,
    scaffoldState: ScaffoldState = rememberScaffoldState()
) {
    // UiState of the HomeScreen
    // val uiState by homeViewModel.uiState.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        item {
            Text(
                text = "Settings View",
                style = MaterialTheme.typography.body1
            )
        }
    }
}

