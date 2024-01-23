package com.br.kmmdemo.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.previews.utils.MockData
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.forecasts.ForecastTabState
import com.br.kmmdemo.ui.forecasts.ForecastTabs
import com.br.kmmdemo.ui.forecasts.HourlyChipList
import com.br.kmmdemo.ui.forecasts.WeeklyChipList

@Preview
@Composable
fun ForecastTabsPreview() {
    KMMTheme {
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