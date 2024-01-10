package com.br.kmmdemo.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Colors
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.bold
import com.br.kmmdemo.theme.light
import com.br.kmmdemo.theme.size
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HomeCurrentWeather(state: HomeState) {
    with(state) {
        Column(
            modifier = Modifier.padding(Dimens.grid_6),
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                // Location Name
                Text(
                    location ?: stringResource(SharedRes.strings.locationError),
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                )
                // Current Temp
                Text(
                    currentTemp?.let {
                        stringResource(SharedRes.strings.input_degrees, currentTemp)
                    } ?: stringResource(SharedRes.strings.tempError),
                    style = MaterialTheme.typography.displayLarge.size(84.sp).light(),
                    textAlign = TextAlign.Center,
                )
                // Weather Description
                Text(
                    weatherDescription ?: stringResource(SharedRes.strings.description_error),
                    style = MaterialTheme.typography.titleMedium,
                    color = Colors.onPrimary.copy(alpha = 0.5F),
                    textAlign = TextAlign.Center,
                )
                // Temp High and Low
                Text(
                    tempHigh?.let {
                        tempLow?.let {
                            stringResource(SharedRes.strings.temp_high_low, tempHigh, tempLow)
                        }
                    } ?: stringResource(SharedRes.strings.highLowTempError),
                    style = MaterialTheme.typography.titleMedium.bold(),
                    textAlign = TextAlign.Center,
                )
            },
        )
    }
}