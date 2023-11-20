package com.br.kmmdemo.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.compose.fontFamilyResource

@Composable
fun getKmpTypography() = Typography(
    displayLarge = TextStyle(
        fontFamily = fontFamilyResource(SharedRes.fonts.Montserrat.medium),
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
    ),
    displayMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    displaySmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    headlineMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    headlineSmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    titleLarge = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    bodyLarge = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
    bodyMedium = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        letterSpacing = 0.03.sp,
    ),
)
