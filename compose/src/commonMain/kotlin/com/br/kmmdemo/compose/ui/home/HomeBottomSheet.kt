package com.br.kmmdemo.compose.ui.home

import WeatherDetails
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.br.kmmdemo.compose.resources.SharedRes
import com.br.kmmdemo.compose.ui.forecasts.ForecastTabState
import com.br.kmmdemo.compose.ui.forecasts.ForecastTabs
import com.br.kmmdemo.compose.ui.forecasts.HourlyChipList
import com.br.kmmdemo.compose.ui.forecasts.WeeklyChipList
import com.br.kmmdemo.compose.ui.shared.GradientCard
import dev.icerock.moko.resources.compose.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeBottomSheet(state: HomeState, sheetState: SheetState) {
    with(state) {
        GradientCard(sheetState) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                content = {
                    ForecastTabs(
                        listOf(
                            ForecastTabState(
                                itemTitle = stringResource(SharedRes.strings.hourly_forecast),
                                content = { HourlyChipList(hourlyForecasts) }
                            ),
                            ForecastTabState(
                                itemTitle = stringResource(SharedRes.strings.weekly_forecast),
                                content = { WeeklyChipList(weeklyForecasts) }
                            )
                        )
                    )
                    WeatherDetails(state.weatherDetailsState)
                }
            )
        }
    }
}