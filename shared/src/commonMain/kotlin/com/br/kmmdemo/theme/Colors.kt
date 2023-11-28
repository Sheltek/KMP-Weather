package com.br.kmmdemo.theme

import androidx.compose.material3.ColorScheme
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
val purple = Color(0xFF48319D)
val lightPurple = Color(0xFF5936B4)
val darkPurple = Color(0xFF362A84)
val darkBlue = Color(0xFF1F1D47)
val brightViolet = Color(0xFFC427FB)
val palePurple = Color(0xFFE0D9FF)
val lightBlue = Color(0xFF40CBD8)

val kmpLightColors = lightColorScheme(
    primary = purple,
    secondary = darkBlue,
    tertiary = palePurple,
    background = palePurple,
    outline = white,
    surface = purple,
    onPrimary = white,
    onSecondary = grey_60_Opacity,
    onTertiary = grey_30_Opacity,
    onBackground = white,
    onSurface = white,
    onSurfaceVariant = lightBlue,
)

val kmpDarkColors = darkColorScheme(
    primary = purple,
    secondary = darkBlue,
    tertiary = brightViolet,
    background = purple,
    outline = white,
    surface = purple,
    onPrimary = white,
    onSecondary = bluishGrey_60_Opacity,
    onTertiary = bluishGrey_30_Opacity,
    onBackground = white,
    onSurface = white,
    onSurfaceVariant = lightBlue,
)