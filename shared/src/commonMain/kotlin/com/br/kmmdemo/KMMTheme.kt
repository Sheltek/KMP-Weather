package com.br.kmmdemo

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.desc.color.asColorDesc

@Composable
fun KMMTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColorScheme(
            primary = colorResource(SharedRes.colors.primary),
            inversePrimary = colorResource(SharedRes.colors.inversePrimary),
            secondary = colorResource(SharedRes.colors.secondary)
        )
    } else {
        lightColorScheme(
            primary = colorResource(SharedRes.colors.primary),
            inversePrimary = colorResource(SharedRes.colors.inversePrimary),
            secondary = colorResource(SharedRes.colors.secondary)
        )
    }
    val typography = Typography(
        bodyMedium = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
