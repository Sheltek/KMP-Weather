package com.sheltek.kmpweather.compose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpWeatherTheme
import com.sheltek.kmpweather.compose.ui.forecasts.WeeklyChipList

@Composable
@Preview
fun WeeklyChipListPreview() {
    KmpWeatherTheme {
        WeeklyChipList(MockData.getMockWeeklyForecast())
    }
}
