package com.br.kmmdemo

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun App(darkTheme: Boolean = false) {
    KMMTheme(darkTheme = darkTheme) {
        Surface {
            Text("Text")
        }
    }
}