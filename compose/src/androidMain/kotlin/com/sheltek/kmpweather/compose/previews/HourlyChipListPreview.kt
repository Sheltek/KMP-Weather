package com.sheltek.kmpweather.compose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpDemoTheme
import com.sheltek.kmpweather.compose.ui.forecasts.HourlyChipList

@Composable
@Preview
fun HourlyChipListPreview() {
    KmpDemoTheme {
        HourlyChipList(MockData.getMockHourlyForecast())
    }
}