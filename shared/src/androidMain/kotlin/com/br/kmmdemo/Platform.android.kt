package com.br.kmmdemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

actual class Platform actual constructor() {
    actual val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    @Composable
    actual fun screenSize(): Int = LocalConfiguration.current.screenWidthDp
}
