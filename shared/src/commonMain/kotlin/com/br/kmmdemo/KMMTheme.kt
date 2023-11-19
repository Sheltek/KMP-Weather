package com.br.kmmdemo

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.bottlerocketstudios.compose.resources.kmpDarkColors
import com.bottlerocketstudios.compose.resources.kmpLightColors
import com.bottlerocketstudios.compose.resources.kmpTypography

@Composable
fun KMMTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        kmpDarkColors
    } else {
        kmpLightColors
    }
    val typography = kmpTypography
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp),
    )

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content,
    )
}
