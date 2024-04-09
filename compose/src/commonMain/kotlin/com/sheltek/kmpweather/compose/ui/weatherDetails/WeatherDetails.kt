
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sheltek.kmpweather.compose.resources.theme.Dimens
import com.sheltek.kmpweather.compose.ui.home.HomeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.WeatherDetailsRow
import com.sheltek.kmpweather.compose.ui.weatherDetails.airQuality.AirQualityEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.airQuality.AirQualityWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.feelsLike.FeelsLikeState
import com.sheltek.kmpweather.compose.ui.weatherDetails.humidity.HumidityState
import com.sheltek.kmpweather.compose.ui.weatherDetails.humidity.HumidityWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.pressure.BarometricPressureState
import com.sheltek.kmpweather.compose.ui.weatherDetails.rainFall.RainFallWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetState
import com.sheltek.kmpweather.compose.ui.weatherDetails.sunrise_sunset.SunriseSunsetWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex.UVIndexEnum
import com.sheltek.kmpweather.compose.ui.weatherDetails.uvIndex.UvIndexWidget
import com.sheltek.kmpweather.compose.ui.weatherDetails.wind.WindWidget

@Composable
fun WeatherDetails(state: HomeState) {
    with(state) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
                .padding(
                    top = Dimens.grid_1_25,
                    start = Dimens.grid_2_5,
                    end = Dimens.grid_2_5,
                ),
        ) {
            AirQualityWidget(airQuality.value ?: AirQualityEnum.UNKNOWN) /// TODO: ASAA-177

            WeatherDetailsRow {
                UvIndexWidget(uvIndexState.value ?: UVIndexEnum.UNKNOWN)
                SunriseSunsetWidget(sunriseSunsetState.value ?: SunriseSunsetState())
            }

            WeatherDetailsRow {
                WindWidget(state)
                RainFallWidget(state)
            }

            WeatherDetailsRow {
                FeelsLikeWidget(feelsLikeState.value ?: FeelsLikeState())
                HumidityWidget(humidityState.value ?: HumidityState())
            }

            WeatherDetailsRow {
                VisibilityWidget(state)
                BarometricPressureWidget(pressureState.value ?: BarometricPressureState())
            }
        }
    }
}