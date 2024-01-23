package com.br.kmmdemo.ui.home

import WeatherDetails
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.ui.forecasts.ForecastTabState
import com.br.kmmdemo.ui.forecasts.ForecastTabs
import com.br.kmmdemo.ui.forecasts.HourlyChipList
import com.br.kmmdemo.ui.forecasts.WeeklyChipList
import com.br.kmmdemo.ui.shared.GradientCard
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HomeBottomSheet(state: HomeState) {
    with(state) {
        GradientCard {
            Column(
                content = {
                    ForecastTabs(listOf(
                        ForecastTabState(
                            itemTitle = stringResource(SharedRes.strings.hourly_forecast),
                            content = { HourlyChipList(hourlyForecasts) }
                        ),
                        ForecastTabState(
                            itemTitle = stringResource(SharedRes.strings.weekly_forecast),
                            content = { WeeklyChipList(weeklyForecasts) }
                        )
                    ))
                    WeatherDetails(state.weatherDetailsState)
                }
            )
        }
    }
}