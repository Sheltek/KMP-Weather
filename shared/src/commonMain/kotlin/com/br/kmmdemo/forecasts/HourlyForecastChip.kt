package com.br.kmmdemo.forecasts

import ForecastChip
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Colors
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.getKmpTypography
import com.br.kmmdemo.theme.kmpLightColors
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun HourlyForecastChip(state: HourlyForecastState) {
    with(state) {
        ForecastChip(
            isNow,
            content = {
                Text(
                    time ?: "",
                    modifier = Modifier.fillMaxWidth(),
                    style = getKmpTypography().bodySmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = kmpLightColors.onPrimary,
                        textAlign = TextAlign.Center,
                    )
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(Dimens.grid_0_25, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = {
                        Image(
                            modifier = Modifier.size(Dimens.grid_4_5),
                            painter = painterResource(weatherIcon.icon),
                            contentDescription = stringResource(SharedRes.strings.weatherIcon),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            precipProbability ?: "",
                            modifier = Modifier.fillMaxWidth().height(Dimens.grid_2_25),
                            style = getKmpTypography().labelLarge.copy(
                                fontWeight = FontWeight.SemiBold,
                                color = kmpLightColors.onSurfaceVariant,
                                textAlign = TextAlign.Center,
                            )
                        )
                    })
                Text(
                    temperature ?: "",
                    modifier = Modifier.fillMaxWidth().height(Dimens.grid_3),
                    style = getKmpTypography().titleSmall.copy(
                        color = kmpLightColors.onPrimary,
                        letterSpacing = 0.38.sp,
                        textAlign = TextAlign.Center,
                    )
                )
            })
    }
}