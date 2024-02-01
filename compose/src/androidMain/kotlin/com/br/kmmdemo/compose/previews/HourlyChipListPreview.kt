package com.br.kmmdemo.compose.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.compose.previews.utils.MockData
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.compose.ui.forecasts.HourlyChipList

@Composable
@Preview
fun HourlyChipListPreview() {
    KMMTheme {
        HourlyChipList(MockData.getMockHourlyForecast())
    }
}