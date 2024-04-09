package com.sheltek.kmpweather.compose.ui.app
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KmpTopBar(title: String) {
    TopAppBar(
        title = { Text(title) }
    )
}