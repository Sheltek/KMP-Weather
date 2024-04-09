package com.sheltek.kmpweather.compose.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.resources.theme.KmpDemoTheme
import com.sheltek.kmpweather.compose.ui.shared.GradientCard

@Preview
@Composable
fun GradientCardPreview() {
    KmpDemoTheme {
        Surface {
            GradientCard(isExpanded = true) {
                ForecastTabsPreview()
            }
        }
    }
}
