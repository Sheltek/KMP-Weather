package com.sheltek.kmpweather.compose.resources.theme

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
val eclipsePurpleLight = Color(0xFF8A72CA)
val eclipsePurple = Color(0xFF5936B4)
val sunriseWhite = Color(0xFF8AA1CB)
val sunriseBlue = Color(0xFF07275B)
val indicatorDarkPurple = Color(0xFF592d85)
val indicatorLightPurple = Color(0xFF8e57e2)

val kmpLightColors = lightColorScheme(
    primary = com.sheltek.kmpweather.compose.resources.theme.purple,
    primaryContainer = com.sheltek.kmpweather.compose.resources.theme.containerPurple,
    secondary = com.sheltek.kmpweather.compose.resources.theme.darkBlue,
    tertiary = com.sheltek.kmpweather.compose.resources.theme.palePurple,
    background = com.sheltek.kmpweather.compose.resources.theme.palePurple,
    outline = com.sheltek.kmpweather.compose.resources.theme.outline,
    outlineVariant = com.sheltek.kmpweather.compose.resources.theme.outlineVariant,
    surface = com.sheltek.kmpweather.compose.resources.theme.purple,
    surfaceVariant = com.sheltek.kmpweather.compose.resources.theme.selectedPurple,
    onPrimary = com.sheltek.kmpweather.compose.resources.theme.white,
    onPrimaryContainer = com.sheltek.kmpweather.compose.resources.theme.white,
    onSecondary = com.sheltek.kmpweather.compose.resources.theme.bluishGrey_60_Opacity,
    onTertiary = com.sheltek.kmpweather.compose.resources.theme.bluishGrey_30_Opacity,
    onBackground = com.sheltek.kmpweather.compose.resources.theme.white,
    onSurface = com.sheltek.kmpweather.compose.resources.theme.white,
    onSurfaceVariant = com.sheltek.kmpweather.compose.resources.theme.white,
    inverseOnSurface = com.sheltek.kmpweather.compose.resources.theme.lightBlue
)

val kmpDarkColors = darkColorScheme(
    primary = com.sheltek.kmpweather.compose.resources.theme.purple,
    primaryContainer = com.sheltek.kmpweather.compose.resources.theme.containerPurple,
    secondary = com.sheltek.kmpweather.compose.resources.theme.darkBlue,
    tertiary = com.sheltek.kmpweather.compose.resources.theme.brightViolet,
    background = com.sheltek.kmpweather.compose.resources.theme.purple,
    outline = com.sheltek.kmpweather.compose.resources.theme.outline,
    outlineVariant = com.sheltek.kmpweather.compose.resources.theme.outlineVariant,
    surface = com.sheltek.kmpweather.compose.resources.theme.purple,
    surfaceVariant = com.sheltek.kmpweather.compose.resources.theme.selectedPurple,
    onPrimary = com.sheltek.kmpweather.compose.resources.theme.white,
    onPrimaryContainer = com.sheltek.kmpweather.compose.resources.theme.white,
    onSecondary = com.sheltek.kmpweather.compose.resources.theme.bluishGrey_60_Opacity,
    onTertiary = com.sheltek.kmpweather.compose.resources.theme.bluishGrey_30_Opacity,
    onBackground = com.sheltek.kmpweather.compose.resources.theme.white,
    onSurface = com.sheltek.kmpweather.compose.resources.theme.white,
    onSurfaceVariant = com.sheltek.kmpweather.compose.resources.theme.white,
    inverseOnSurface = com.sheltek.kmpweather.compose.resources.theme.lightBlue
)

data class GradientColors(
    val weatherWidgetGradient: List<Color>,
    val sliderTrackGradient: List<Color>,
    val sideEclipseGradient: List<Color>,
    val topEclipseGradient: List<Pair<Float, Color>>,
    val sunriseGradient: List<Color>,
    val indicatorGradient: List<Color>
)

fun KmpGradientColors(
    weatherWidgetGradient: List<Color> = listOf(
        com.sheltek.kmpweather.compose.resources.theme.lightPurple,
        com.sheltek.kmpweather.compose.resources.theme.darkPurple
    ),
    sliderTrackGradient: List<Color> = listOf(
        com.sheltek.kmpweather.compose.resources.theme.sliderBlue,
        com.sheltek.kmpweather.compose.resources.theme.sliderPink,
        com.sheltek.kmpweather.compose.resources.theme.sliderPurple
    ),
    sideEclipseGradient: List<Color> = listOf(
        com.sheltek.kmpweather.compose.resources.theme.eclipsePurpleLight.copy(alpha = 0.32f),
        com.sheltek.kmpweather.compose.resources.theme.purple.copy(alpha = 0.0f)
    ),
    topEclipseGradient: List<Pair<Float, Color>> = listOf(
        0.0f to com.sheltek.kmpweather.compose.resources.theme.eclipsePurpleLight.copy(alpha = 0.60f),
        0.5f to com.sheltek.kmpweather.compose.resources.theme.eclipsePurpleLight.copy(alpha = 0.235f),
        0.798f to com.sheltek.kmpweather.compose.resources.theme.eclipsePurpleLight.copy(alpha = 0.0392f),
        0.9f to com.sheltek.kmpweather.compose.resources.theme.eclipsePurple.copy(alpha = 0.0f),
        1.0f to Color.Transparent
    ),
    sunriseGradient: List<Color> = listOf(
        com.sheltek.kmpweather.compose.resources.theme.sunriseBlue,
        com.sheltek.kmpweather.compose.resources.theme.sunriseWhite,
        com.sheltek.kmpweather.compose.resources.theme.sunriseBlue
    ),
    indicatorGradient: List<Color> = listOf(
        com.sheltek.kmpweather.compose.resources.theme.indicatorDarkPurple,
        com.sheltek.kmpweather.compose.resources.theme.indicatorLightPurple,
        com.sheltek.kmpweather.compose.resources.theme.indicatorDarkPurple
    )
): com.sheltek.kmpweather.compose.resources.theme.GradientColors =
    com.sheltek.kmpweather.compose.resources.theme.GradientColors(
        weatherWidgetGradient = weatherWidgetGradient,
        sliderTrackGradient = sliderTrackGradient,
        sideEclipseGradient = sideEclipseGradient,
        topEclipseGradient = topEclipseGradient,
        sunriseGradient = sunriseGradient,
        indicatorGradient = indicatorGradient,
    )