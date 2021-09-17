package com.icedtealabs.flip.ui

import android.media.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.tooling.preview.Preview
import com.icedtealabs.flip.ui.theme.FlipColors

@Composable
fun HomeAppBar(
    title: String,
) {
    TopAppBar(
        title = {
            Row {
                Text(text = title, style = MaterialTheme.typography.h5
                )
            }
        },
        backgroundColor = FlipColors.Background,
        actions = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                IconButton(
                    onClick = { /* TODO: Open search */ }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search"
                    )
                }

            }
        },
    )
}

@Preview
@Composable
fun Preview() {
    HomeAppBar(title = "Library")
}
