package com.icedtealabs.flip.ui.home

import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    // homeViewModel: HomeViewModel,
    // navigateToArticle: (String) -> Unit,
    scaffoldState: ScaffoldState = rememberScaffoldState()
) {
    // UiState of the HomeScreen
    // val uiState by homeViewModel.uiState.collectAsState()

    Text(text = "Home")
}

