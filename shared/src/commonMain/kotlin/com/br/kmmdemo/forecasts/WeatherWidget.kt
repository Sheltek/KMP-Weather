import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.br.kmmdemo.forecasts.SlantedShape
import com.br.kmmdemo.forecasts.WeatherWidgetState
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.darkPurple
import com.br.kmmdemo.theme.getKmpTypography
import com.br.kmmdemo.theme.kmpDarkColors
import com.br.kmmdemo.theme.kmpLightColors
import com.br.kmmdemo.theme.lightPurple
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun WeatherWidget(state: WeatherWidgetState) {
    with(state) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(Dimens.grid_24)
                .background(
                    brush = Brush.linearGradient(listOf(lightPurple, darkPurple)),
                    shape = SlantedShape()
                )
        ) {
            Row(
                modifier = Modifier.matchParentSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.padding(top = Dimens.grid_3_75, start = Dimens.grid_2_5),
                    content = {
                        Text(
                            text = tempCurrent ?: "",
                            style = getKmpTypography().displayLarge.copy(
                                fontSize = 64.sp,
                                color = kmpLightColors.outline
                            ),
                        )
                        Text(
                            modifier = Modifier.padding(top = Dimens.grid_2_25),
                            text = tempHighLow ?: "",
                            style = getKmpTypography().labelLarge.copy(
                                color = kmpDarkColors.onSecondary
                            )
                        )
                        Text(
                            text = location ?: "",
                            style = getKmpTypography().bodySmall.copy(
                                color = kmpDarkColors.outline
                            )
                        )
                    }
                )


                Column(
                    modifier = Modifier.padding(end = Dimens.grid_2_5),
                    content = {
                        Image(
                            modifier = Modifier.size(140.dp), //TODO: extract Dimension
                            painter = painterResource(weatherIcon.icon),
                            contentDescription = weatherIcon.weather,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = Dimens.grid_1_75)
                                .align(alignment = Alignment.End),
                            text = weatherIcon.weather,
                            style = getKmpTypography().labelLarge.copy(
                                color = kmpDarkColors.outline
                            )
                        )
                    }
                )
            }
        }
    }
}