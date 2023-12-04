package com.br.kmmdemo.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val black = Color(0xFF000000)
val white = Color(0xFFFFFFFF)
val grey_60_Opacity = Color(0x993C3C43)
val grey_30_Opacity = Color(0x4D3C3C43)
val grey_18_Opacity = Color(0x2E3C3C43)
val bluishGrey_60_Opacity = Color(0x99EBEBF5)
val bluishGrey_30_Opacity = Color(0x4DEBEBF5)
val bluishGrey_18_Opacity = Color(0x2EEBEBF5)
val purple = Color(0xFF343069)
val containerPurple = Color(0xFF282453)
val selectedPurple = Color(0xFF48319D)
val darkBlue = Color(0xFF1F1D47)
val brightViolet = Color(0xFFC427FB)
val palePurple = Color(0xFFE0D9FF)
val lightBlue = Color(0xFF40CBD8)
val outline = Color(0xFF6C4ACE)
val outlineVariant = Color(0xFF5747A5)

//// Gradient Colors ////
val lightPurple = Color(0xFF5936B4)
val darkPurple = Color(0xFF362A84)
val sliderBlue = Color(0xFF3858B2)
val sliderPink = Color(0xFFAA59E2)
val sliderPurple = Color(0xFFE64495)

val kmpLightColors = lightColorScheme(
    primary = purple,
    primaryContainer = containerPurple,
    secondary = darkBlue,
    tertiary = palePurple,
    background = palePurple,
    outline = outline,
    outlineVariant = outlineVariant,
    surface = purple,
    surfaceVariant = selectedPurple,
    onPrimary = white,
    onPrimaryContainer = white,
    onSecondary = bluishGrey_60_Opacity,
    onTertiary = bluishGrey_30_Opacity,
    onBackground = white,
    onSurface = white,
    onSurfaceVariant = white,
    inverseOnSurface = lightBlue
)

val kmpDarkColors = darkColorScheme(
    primary = purple,
    primaryContainer = containerPurple,
    secondary = darkBlue,
    tertiary = brightViolet,
    background = purple,
    outline = outline,
    outlineVariant = outlineVariant,
    surface = purple,
    surfaceVariant = selectedPurple,
    onPrimary = white,
    onPrimaryContainer = white,
    onSecondary = bluishGrey_60_Opacity,
    onTertiary = bluishGrey_30_Opacity,
    onBackground = white,
    onSurface = white,
    onSurfaceVariant = white,
    inverseOnSurface = lightBlue
)

data class GradientColors(
    val weatherWidgetGradient: List<Color>,
    val sliderTrackGradient: List<Color>,
)

fun KMMGradientColors(
    weatherWidgetGradient: List<Color> = listOf(lightPurple, darkPurple),
    sliderTrackGradient: List<Color> = listOf(sliderBlue, sliderPink, sliderPurple)
): GradientColors = GradientColors(
    weatherWidgetGradient = weatherWidgetGradient,
    sliderTrackGradient = sliderTrackGradient,
)