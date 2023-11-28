import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.forecasts.WeatherEnum
import com.br.kmmdemo.forecasts.WeatherWidgetState

@Composable
@Preview
fun `Preview Weather Widget`() {
    WeatherWidget(
        state = WeatherWidgetState(
            tempCurrent = "63\u00B0",
            tempHighLow = "H: 70°  L: 60°",
            location = "Dallas, TX USA",
            weatherIcon = WeatherEnum.NIGHT_THUNDERSTORM
        )
    )
}
