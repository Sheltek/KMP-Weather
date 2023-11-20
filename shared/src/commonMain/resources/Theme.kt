package com.bottlerocketstudios.compose.resources

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalWindowInfo
import com.br.kmmdemo.Platform
import com.br.kmmdemo.di.platformModule

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
fun ArchitectureDemoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkColorScheme() else lightColorScheme()
    val configuration =
    val dimensions = if (configuration.screenWidthDp <= SMALL_SCREEN_WIDTH_DP) smallDimensions else sw360Dimensions

    ProvideDimens(dimensions = dimensions) {
        ProvideColors(colors = colors) {
            MaterialTheme(
                colorScheme = colors,
                typography = kmpTypography
            ) {
                Surface(color = Colors.background) {
                    content()
                }
            }
        }
    }
}

object ArchitectureDemoTheme {
    val colors: ColorScheme
        @Composable
        get() = LocalAppColors.current

    val dimens: Dimensions
        @Composable
        get() = LocalAppDimens.current
}

val Dimens: Dimensions
    @Composable
    get() = ArchitectureDemoTheme.dimens

val Colors: ColorScheme
    @Composable
    get() = ArchitectureDemoTheme.colors
