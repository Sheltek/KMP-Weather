package com.br.kmmdemo

import androidx.compose.runtime.Composable
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen

actual class Platform actual constructor() {
    actual val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    @OptIn(ExperimentalForeignApi::class)
    @Composable
    actual fun screenSize(): Int = UIScreen.mainScreen.bounds.size
}