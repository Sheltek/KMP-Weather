package com.br.kmmdemo.ui.weatherDetails.humidity

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.letterSpacing
import com.br.kmmdemo.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsSurface
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HumidityWidget(humidityState: HumidityState) {
    WeatherDetailsSurface(
        content = {
            DetailsWidgetLabel(
                icon = SharedRes.images.humidity_icon,
                iconDesc = SharedRes.strings.humidity,
                label = SharedRes.strings.humidity,
            )

            Text(
                stringResource(
                    SharedRes.strings.input_percentage,
                    humidityState.humidity?.toInt()
                        ?: stringResource(SharedRes.strings.number_error)
                ),
                modifier = Modifier.padding(top = Dimens.grid_2),
                style = MaterialTheme.typography.titleLarge.letterSpacing(0.96.sp)
            )

            Text(
                stringResource(
                    SharedRes.strings.humidity_dew_description,
                    humidityState.dewPoint?.toInt()
                        ?: stringResource(SharedRes.strings.unknown_number)
                ),
                modifier = Modifier.padding(top = Dimens.grid_3),
                style = MaterialTheme.typography.labelLarge
            )
        }
    )
}