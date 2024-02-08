package com.br.kmmdemo.compose.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.compose.ui.shared.GradientCard

@Preview
@Composable
fun GradientCardPreview() {
    KMMTheme {
        Surface {
            GradientCard(isExpanded = true) {
                ForecastTabsPreview()
            }
        }
    }
}
