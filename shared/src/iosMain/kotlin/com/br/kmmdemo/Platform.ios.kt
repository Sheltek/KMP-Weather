package com.br.kmmdemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalWindowInfo
import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    @Composable
    actual fun screenSize(): Int = UIDevice.currentDevice
}