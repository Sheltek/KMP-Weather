package com.br.kmmdemo.compose.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.compose.resources.SharedRes
import com.br.kmmdemo.compose.resources.theme.Colors
import com.br.kmmdemo.compose.resources.theme.Dimens
import com.br.kmmdemo.compose.resources.theme.bold
import com.br.kmmdemo.compose.resources.theme.light
import com.br.kmmdemo.compose.resources.theme.size

import dev.icerock.moko.resources.compose.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeCurrentWeather(state: HomeState, sheetState: SheetState) {
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

                // TODO: Extract Conditionals to an extension function
                // Current Temp
                if (sheetState.currentValue != SheetValue.Expanded) {
                    Text(
                        currentTemp?.let {
                            stringResource(SharedRes.strings.input_degrees, currentTemp)
                        } ?: stringResource(SharedRes.strings.tempError),
                        color = Colors.onPrimary,
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
                } else {
                    Text(
                        currentTemp?.let { temp ->
                            weatherDescription?.let { desc ->
                                stringResource(SharedRes.strings.input_collapsed_details, temp, desc)
                            }
                        } ?: stringResource(SharedRes.strings.input_collapsed_error),
                        style = MaterialTheme.typography.titleMedium,
                        color = Colors.onPrimary.copy(alpha = 0.5F),
                        textAlign = TextAlign.Center,
                    )
                }
                // Temp High and Low
                if (sheetState.currentValue != SheetValue.Expanded) {
                    Text(
                        tempHigh?.let {
                            tempLow?.let {
                                stringResource(SharedRes.strings.temp_high_low, tempHigh, tempLow)
                            }
                        } ?: stringResource(SharedRes.strings.highLowTempError),
                        style = MaterialTheme.typography.titleMedium.bold(),
                        textAlign = TextAlign.Center,
                    )
                }
            },
        )
    }
}