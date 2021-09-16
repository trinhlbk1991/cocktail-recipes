package com.icedtealabs.flip.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.icedtealabs.flip.ui.theme.FlipColors.Accent
import com.icedtealabs.flip.ui.theme.FlipColors.Background
import com.icedtealabs.flip.ui.theme.FlipColors.Primary

private val DarkColorPalette = darkColors(
    primary = Primary,
    primaryVariant = Primary,
    secondary = Accent
)

private val LightColorPalette = lightColors(
    primary = Primary,
    primaryVariant = Primary,
    secondary = Accent,
    background = Background,
    /* Other default colors to override
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun FlipTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
