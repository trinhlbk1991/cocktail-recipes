package com.icedtealabs.flip.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocalLibrary
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.icedtealabs.flip.ui.navigation.Routes

sealed class NavigationItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object Home : NavigationItem(Routes.HOME, Icons.Rounded.Home, "Home")

    object Library : NavigationItem(Routes.LIBRARY, Icons.Rounded.LocalLibrary, "Library")

    object Settings : NavigationItem(Routes.SETTINGS, Icons.Rounded.Settings, "Settings")

    companion object {
        fun fromRoute(route: String): NavigationItem {
            return when (route) {
                Routes.HOME -> Home
                Routes.LIBRARY -> Library
                Routes.SETTINGS -> Settings
                else -> Home
            }
        }
    }
}
