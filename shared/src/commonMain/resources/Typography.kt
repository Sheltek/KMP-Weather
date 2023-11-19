package com.bottlerocketstudios.compose.resources

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// FONT FAMILY CAN ONLY BE SET AT THE COMPOSABLE WHEN USING MOKO RESOURCES AT THIS TIME

val kmpTypography = Typography(
    displayLarge = TextStyle(
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
