package com.sheltek.kmpweather.compose.ui.weatherDetails.rainFall

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
import com.sheltek.kmpweather.compose.ui.home.HomeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.DetailsWidgetLabel
import com.sheltek.kmpweather.compose.ui.weatherDetails.WeatherDetailsSurface
import com.sheltek.kmpweather.utils.MeasurementType
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun RainFallWidget(state: HomeState) {
    val isMetric = state.measurementPref.value == MeasurementType.METRIC
    val rainFallUnit = if (isMetric) SharedRes.strings.input_rainfall_mm else SharedRes.strings.input_rainfall_in

    with(state.rainFallState) {
        WeatherDetailsSurface(
            content = {
                DetailsWidgetLabel(
                    icon = SharedRes.images.raindrop,
                    iconDesc = SharedRes.strings.rainfall,
                    label = SharedRes.strings.rainfall,
                )

                Text(
                    value?.currentAccumulation?.let { rain ->
                        stringResource(rainFallUnit, rain.toString())
                    } ?: stringResource(SharedRes.strings.empty_digits_error),
                    modifier = Modifier.padding(top = Dimens.grid_1_5),
                    style = MaterialTheme.typography.titleMedium.letterSpacing(0.96.sp)
                )

                Text(
                    stringResource(SharedRes.strings.in_last_hour),
                    style = MaterialTheme.typography.bodyMedium.bold()
                )

                Text(
                    stringResource(
                        SharedRes.strings.input_expected_rainfall,
                        value?.expectedAccumulation
                            ?: stringResource(SharedRes.strings.empty_digits_error)
                    ),
                    modifier = Modifier.padding(top = Dimens.grid_2_5),
                    style = MaterialTheme.typography.labelLarge
                )
            }
        )
    }

}