package com.br.kmmdemo.ui.forecasts

import ForecastChip
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.br.kmmdemo.theme.Dimens

@Composable
fun WeeklyChipList(dailyStates: List<ForecastState>) {
    LazyRow(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(Dimens.grid_3),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        items(dailyStates) { dailyForecast ->
            ForecastChip(state = dailyForecast) { state ->
                DailyForecastChip(state)
            }
        }
    }
}