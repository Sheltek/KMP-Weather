import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsRow
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsState
import com.br.kmmdemo.ui.weatherDetails.airQuality.AirQualityWidget
import com.br.kmmdemo.ui.weatherDetails.humidity.HumidityWidget
import com.br.kmmdemo.ui.weatherDetails.rainFall.RainFallWidget
import com.br.kmmdemo.ui.weatherDetails.sunrise_sunset.SunriseSunsetWidget
import com.br.kmmdemo.ui.weatherDetails.uvIndex.UvIndexWidget
import com.br.kmmdemo.ui.weatherDetails.wind.WindWidget

@Composable
fun WeatherDetails(state: WeatherDetailsState) {
    with(state) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = Dimens.grid_1_75)
        ) {
            AirQualityWidget(airQuality)

            WeatherDetailsRow {
                UvIndexWidget(uvIndexState)
                SunriseSunsetWidget(sunriseSunsetState)
            }

            WeatherDetailsRow {
                WindWidget(windState)
                RainFallWidget(rainFallState)
            }

            WeatherDetailsRow {
                FeelsLikeWidget(feelsLikeState)
                HumidityWidget(humidityState)
            }

            WeatherDetailsRow {
                VisibilityWidget(visibilityState)
                BarometricPressureWidget(pressureState)
            }
        }
    }
}