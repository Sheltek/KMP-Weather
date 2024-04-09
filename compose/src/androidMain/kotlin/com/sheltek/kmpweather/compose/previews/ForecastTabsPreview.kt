package com.sheltek.kmpweather.compose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpWeatherTheme
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastTabState
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastTabs
import com.sheltek.kmpweather.compose.ui.forecasts.HourlyChipList
import com.sheltek.kmpweather.compose.ui.forecasts.WeeklyChipList

@Preview
@Composable
fun ForecastTabsPreview() {
    KmpWeatherTheme {
        ForecastTabs(listOf(
            ForecastTabState(
                itemTitle = "Hourly Forecast",
                content = { HourlyChipList(MockData.getMockHourlyForecast()) }
            ),
            ForecastTabState(
                itemTitle = "Weekly Forecast",
                content = { WeeklyChipList(MockData.getMockWeeklyForecast()) }
            )
        ))
    }
}