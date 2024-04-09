package com.sheltek.kmpweather.compose.ui.home

import WeatherDetails
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sheltek.kmpweather.compose.SharedRes
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastTabState
import com.sheltek.kmpweather.compose.ui.forecasts.ForecastTabs
import com.sheltek.kmpweather.compose.ui.forecasts.HourlyChipList
import com.sheltek.kmpweather.compose.ui.forecasts.WeeklyChipList
import com.sheltek.kmpweather.compose.ui.shared.GradientCard
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HomeBottomSheet(state: HomeState, sheetState: Boolean) {
    with(state) {
        GradientCard(sheetState) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                content = {
                    ForecastTabs(
                        listOf(
                            ForecastTabState(
                                itemTitle = stringResource(SharedRes.strings.hourly_forecast),
                                content = {
                                    if (hourlyForecasts.value != null) {
                                        HourlyChipList(hourlyForecasts.value!!)
                                    } else {
                                        Text(
                                            text = stringResource(SharedRes.strings.forecasts_unavailable),
                                            style = MaterialTheme.typography.bodySmall,
                                        )
                                    }
                                }
                            ),
                            ForecastTabState(
                                itemTitle = stringResource(SharedRes.strings.weekly_forecast),
                                content = {
                                    if (dailyForecasts.value != null) {
                                        WeeklyChipList(dailyForecasts.value!!)
                                    } else {
                                        Text(
                                            text = stringResource(SharedRes.strings.forecasts_unavailable),
                                            style = MaterialTheme.typography.bodySmall,
                                        )
                                    }
                                }
                            )
                        )
                    )
                    WeatherDetails(state)
                }
            )
        }
    }
}