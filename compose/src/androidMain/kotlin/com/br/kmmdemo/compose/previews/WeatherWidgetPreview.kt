
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.compose.ui.forecasts.WeatherEnum
import com.br.kmmdemo.compose.ui.forecasts.WeatherWidgetState

@Composable
@Preview
fun PreviewWeatherWidget() {
    KMMTheme {
        WeatherWidget(
            state = WeatherWidgetState(
                tempCurrent = "63\u00B0",
                tempHighLow = "H: 70°  L: 60°",
                location = "Dallas, TX USA",
                weatherIcon = WeatherEnum.NIGHT_THUNDERSTORM
            )
        )
    }
}

@Composable
@Preview
fun PreviewWeatherWidgetERROR() {
    KMMTheme {
        WeatherWidget(
            state = WeatherWidgetState(
                weatherIcon = WeatherEnum.DAY_RAIN
            )
        )
    }
}
