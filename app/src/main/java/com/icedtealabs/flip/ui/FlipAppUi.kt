package com.icedtealabs.flip.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.icedtealabs.flip.ui.navigation.FlipNavGraph
import com.icedtealabs.flip.ui.navigation.Routes
import com.icedtealabs.flip.ui.theme.FlipColors
import com.icedtealabs.flip.ui.theme.FlipColors.LightBackground
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
            val currentRoute = navBackStackEntry?.destination?.route ?: Routes.HOME
            val navigationItem = NavigationItem.fromRoute(currentRoute)

            Surface(
                color = LightBackground,
                modifier = Modifier.fillMaxSize(),
            ) {
                Scaffold(
                    scaffoldState = scaffoldState,
                    bottomBar = { BottomNavigationBar(navController = navController) },
                    modifier = Modifier.navigationBarsPadding(),
                    topBar = { HomeAppBar(title = navigationItem.title) }
                ) {
                    FlipNavGraph(
                        navController = navController,
                        scaffoldState = scaffoldState,
                    )
                }
            }
        }
    }
}
