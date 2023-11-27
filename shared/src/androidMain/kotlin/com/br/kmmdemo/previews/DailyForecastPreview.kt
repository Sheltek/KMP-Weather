package com.br.kmmdemo.previews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import com.br.kmmdemo.forecasts.DailyForecastChip
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.DailyForecastState
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.resources.SharedRes.strings.weatherIcon
import com.br.kmmdemo.theme.Dimens
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

private val dailyForecast = DailyForecastState(
    day = "TUE",
    precipProbability = "30%",
    temperature = "63\u00B0",
    weatherIcon = WeatherEnum.DAY_FOG,
)

@Composable
@Preview
fun PreviewTodayDailyForecast() {
    val forecast = dailyForecast.copy(isToday = true)
    DailyForecastChip(state = forecast)
}

@Composable
@Preview
fun PreviewDailyForecast() {
    DailyForecastChip(state = dailyForecast)
}