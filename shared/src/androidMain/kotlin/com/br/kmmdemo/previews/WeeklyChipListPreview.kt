package com.br.kmmdemo.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.previews.utils.MockData
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.forecasts.WeeklyChipList

@Composable
@Preview
fun `Weekly Chip List Preview`() {
    KMMTheme {
        WeeklyChipList(dailyStates = MockData.getMockWeeklyForecast())
    }
}
