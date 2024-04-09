package com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.sheltek.kmpweather.compose.SharedRes
import com.sheltek.kmpweather.compose.resources.theme.Dimens
import com.sheltek.kmpweather.compose.resources.theme.bold
import com.sheltek.kmpweather.compose.resources.theme.letterSpacing
import com.sheltek.kmpweather.compose.ui.shared.KmpWeatherSlider
import com.sheltek.kmpweather.compose.ui.weatherDetails.DetailsWidgetLabel
import com.sheltek.kmpweather.compose.ui.weatherDetails.WeatherDetailsSurface
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun UvIndexWidget(uvIndex: UVIndexEnum) {
    WeatherDetailsSurface(
        content = {
            DetailsWidgetLabel(
                icon = SharedRes.images.uv_index_icon,
                iconDesc = SharedRes.strings.uv_index_label,
                label = SharedRes.strings.uv_index_label,
            )

            Text(
                stringResource(uvIndex.indexValue),
                modifier = Modifier.padding(top = Dimens.grid_2),
                style = MaterialTheme.typography.titleMedium.bold().letterSpacing(0.86.sp)
            )

            Text(
                stringResource(uvIndex.description),
                style = MaterialTheme.typography.bodyLarge.bold().letterSpacing(0.86.sp)
            )

            KmpWeatherSlider(
                initValue = uvIndex.sliderValue,
                valueRange = 0f..0.5f,
            )
        }
    )
}