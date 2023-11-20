package com.br.kmmdemo

import androidx.compose.runtime.Composable

expect class Platform() {
    val name: String

    @Composable
    fun screenSize(): Int
}
