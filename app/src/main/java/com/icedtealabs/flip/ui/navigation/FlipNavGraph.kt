package com.icedtealabs.flip.ui.navigation

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.icedtealabs.flip.ui.home.HomeScreen
import com.icedtealabs.flip.ui.library.LibraryScreen
import com.icedtealabs.flip.ui.library.LibraryViewModel
import com.icedtealabs.flip.ui.settings.SettingsScreen

object Routes {
    const val HOME = "home"
    const val LIBRARY = "library"
    const val SETTINGS = "settings"
}

class MainActions(navController: NavHostController) {
    val navigateToArticle: (String) -> Unit = { postId: String ->
        // navController.navigate("${MainDestinations.ARTICLE_ROUTE}/$postId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}

@Composable
fun FlipNavGraph(
    navController: NavHostController = rememberNavController(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    startDestination: String = Routes.HOME,
) {
    val actions = remember(navController) { MainActions(navController) }
    val coroutineScope = rememberCoroutineScope()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.HOME) {
//            val homeViewModel: HomeViewModel = viewModel(
//                factory = HomeViewModel.provideFactory(appContainer.postsRepository)
//            )
            HomeScreen(
//                homeViewModel = homeViewModel,
//                navigateToArticle = actions.navigateToArticle,
//                openDrawer = openDrawer
            )
        }
        composable(Routes.LIBRARY) {
            val viewModel: LibraryViewModel = hiltViewModel()
            LibraryScreen(viewModel = viewModel)
        }
        composable(Routes.SETTINGS) {
            SettingsScreen()
        }
    }
}
