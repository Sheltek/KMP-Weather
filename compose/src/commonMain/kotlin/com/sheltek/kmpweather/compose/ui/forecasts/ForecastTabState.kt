package com.sheltek.kmpweather.compose.ui.forecasts

import androidx.compose.runtime.Composable

data class ForecastTabState(
    val itemTitle: String,
    val content: @Composable () -> Unit,
)