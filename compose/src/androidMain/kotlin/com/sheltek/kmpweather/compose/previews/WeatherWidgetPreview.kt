
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.resources.theme.KmpDemoTheme
import com.sheltek.kmpweather.compose.ui.forecasts.WeatherEnum
import com.sheltek.kmpweather.compose.ui.forecasts.WeatherWidgetState

@Composable
@Preview
fun PreviewWeatherWidget() {
    KmpDemoTheme {
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
    KmpDemoTheme {
        WeatherWidget(
            state = WeatherWidgetState(
                weatherIcon = WeatherEnum.DAY_RAIN
            )
        )
    }
}
