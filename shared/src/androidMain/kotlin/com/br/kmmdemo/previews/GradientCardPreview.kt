package com.br.kmmdemo.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.previews.utils.MockData
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.forecasts.HourlyChipList
import com.br.kmmdemo.ui.shared.GradientCard

@Preview
@Composable
fun GradientCardPreview() {
    KMMTheme {
        Surface {
            GradientCard { HourlyChipList(dailyStates = MockData.getMockHourlyForecast()) }
        }
    }
}
