package com.br.kmmdemo.ui.weatherDetails.sunrise_sunset

import SunriseBezierCurve
import adjustSunsetTime
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.bold
import com.br.kmmdemo.theme.letterSpacing
import com.br.kmmdemo.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsSurface
import dev.icerock.moko.resources.compose.stringResource
import timeToFractionOfDay

@Composable
fun SunriseSunsetWidget(state: SunriseSunsetState) {
    val currentTimeFloat = state.localTime?.let { it.timeToFractionOfDay() }
    val sunriseFloat = state.sunriseTime?.let { it.timeToFractionOfDay() }
    val sunsetFloat = state.sunsetTime?.let { it.timeToFractionOfDay() }

    WeatherDetailsSurface(
        columnModifier = Modifier.padding(top = Dimens.grid_2_5),
        content = {
            Column(
                modifier = Modifier.padding(
                    start = Dimens.grid_2_5,
                    bottom = Dimens.grid_2_5,
                    ),
            ) {
                DetailsWidgetLabel(
                    icon = SharedRes.images.sunrise_icon,
                    iconDesc = SharedRes.strings.sunrise,
                    label = SharedRes.strings.sunrise,
                )

                Text(
                    stringResource(
                        SharedRes.strings.input_sunrise,
                        state.sunriseTime
                            ?: stringResource(SharedRes.strings.empty_digits_error)
                    ),
                    modifier = Modifier.padding(top = Dimens.grid_0_25),
                    style = MaterialTheme.typography.titleMedium.letterSpacing(0.96.sp).bold()
                )
            }

            SunriseBezierCurve(
                currentTimeFloat ?: 0F,
                sunriseFloat ?: 0F,
                sunsetFloat ?: 0F,
                )

            Text(
                stringResource(
                    SharedRes.strings.input_sunset,
                    state.sunsetTime?.adjustSunsetTime()
                        ?: stringResource(SharedRes.strings.empty_digits_error)
                ),
                modifier = Modifier
                    .padding(horizontal = Dimens.grid_2_5)
                    .padding(top = Dimens.grid_1),
                style = MaterialTheme.typography.labelMedium
            )
        }
    )
}