package com.icedtealabs.flip.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.icedtealabs.flip.ui.navigation.FlipNavGraph
import com.icedtealabs.flip.ui.navigation.MainDestinations
import com.icedtealabs.flip.ui.theme.FlipTheme

@Composable
fun FlipAppUi() {
    FlipTheme {
        ProvideWindowInsets {
            val systemUiController = rememberSystemUiController()
            val darkIcons = MaterialTheme.colors.isLight
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = darkIcons)
            }

            val navController = rememberNavController()
            val coroutineScope = rememberCoroutineScope()

            val scaffoldState = rememberScaffoldState()

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route ?: MainDestinations.HOME_ROUTE

            Scaffold(
                scaffoldState = scaffoldState,
            ) {
                FlipNavGraph(
                    navController = navController,
                    scaffoldState = scaffoldState,
                )
            }
        }
    }
}
