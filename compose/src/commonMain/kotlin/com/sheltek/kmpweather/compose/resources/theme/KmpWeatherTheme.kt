package com.sheltek.kmpweather.compose.resources.theme

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
const val SMALL_SCREEN_WIDTH_DP = 360

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

private val LocalGradientTheme = staticCompositionLocalOf {
    com.sheltek.kmpweather.compose.resources.theme.KmpGradientColors()
}

@Composable
fun KmpWeatherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dimensions: Dimensions = sw360Dimensions,
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        com.sheltek.kmpweather.compose.resources.theme.kmpDarkColors
    } else {
        com.sheltek.kmpweather.compose.resources.theme.kmpLightColors
    }
    val typography = getKmpTypography()
    val gradientColors = com.sheltek.kmpweather.compose.resources.theme.KmpGradientColors()
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp),
    )
    ProvideDimens(dimensions = dimensions) {
        ProvideColors(colors = colors) {
            CompositionLocalProvider(LocalGradientTheme provides gradientColors) {
                MaterialTheme(
                    colorScheme = colors,
                    typography = typography,
                    shapes = shapes,
                    content = content,
                )
            }
        }
    }
}

object KmpWeatherTheme {
    val colors: ColorScheme
        @Composable
        get() = LocalAppColors.current

    val dimens: Dimensions
        @Composable
        get() = LocalAppDimens.current

    val gradientColors: com.sheltek.kmpweather.compose.resources.theme.GradientColors
    @Composable
    get() = LocalGradientTheme.current
}

val Dimens: Dimensions
    @Composable
    get() = KmpWeatherTheme.dimens

val Colors: ColorScheme
    @Composable
    get() = KmpWeatherTheme.colors

val Gradients: com.sheltek.kmpweather.compose.resources.theme.GradientColors
    @Composable
    get() = KmpWeatherTheme.gradientColors
