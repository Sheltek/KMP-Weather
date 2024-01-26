package com.br.kmmdemo.compose.ui.weatherDetails.rainFall

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.compose.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.compose.ui.weatherDetails.WeatherDetailsSurface
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.bold
import com.br.kmmdemo.theme.letterSpacing
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun RainFallWidget(rainFallState: RainFallState) {
    WeatherDetailsSurface(
        content = {
            DetailsWidgetLabel(
                icon = SharedRes.images.raindrop,
                iconDesc = SharedRes.strings.rainfall,
                label = SharedRes.strings.rainfall,
            )

            Text(
                rainFallState.currentAccumulation
                    ?: stringResource(SharedRes.strings.empty_digits_error),
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
                    rainFallState.expectedAccumulation
                        ?: stringResource(SharedRes.strings.empty_digits_error)
                ),
                modifier = Modifier.padding(top = Dimens.grid_2_5),
                style = MaterialTheme.typography.labelLarge
            )
        }
    )
}