package com.br.kmmdemo.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

@Composable
fun ProvideColors(
    colors: ColorScheme,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors }
    CompositionLocalProvider(LocalAppColors provides colorPalette, content = content)
}

private val LocalAppColors = staticCompositionLocalOf {
    lightColorScheme()
}
private const val SMALL_SCREEN_WIDTH_DP = 360

@Composable
fun ProvideDimens(
    dimensions: Dimensions,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf {
    sw360Dimensions
}

@Composable
fun KMMTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    width: Int,
    content: @Composable () -> Unit,
) {
    val dimensions =
        if (width <= SMALL_SCREEN_WIDTH_DP) smallDimensions else sw360Dimensions

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
    ProvideDimens(dimensions = dimensions) {
        ProvideColors(colors = colors) {
            MaterialTheme(
                colorScheme = colors,
                typography = typography,
                shapes = shapes,
                content = content,
            )
        }
    }
}

object KmpDemoTheme {
    val colors: ColorScheme
        @Composable
        get() = LocalAppColors.current

    val dimens: Dimensions
        @Composable
        get() = LocalAppDimens.current
}

val Dimens: Dimensions
    @Composable
    get() = KmpDemoTheme.dimens

val Colors: ColorScheme
    @Composable
    get() = KmpDemoTheme.colors
