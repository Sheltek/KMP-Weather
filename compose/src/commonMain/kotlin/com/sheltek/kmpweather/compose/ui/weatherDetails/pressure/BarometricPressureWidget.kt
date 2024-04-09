
import androidx.compose.runtime.Composable
import com.sheltek.kmpweather.compose.SharedRes
import com.sheltek.kmpweather.compose.ui.weatherDetails.DetailsWidgetLabel
import com.sheltek.kmpweather.compose.ui.weatherDetails.WeatherDetailsSurface
import com.sheltek.kmpweather.compose.ui.weatherDetails.pressure.BarometricPressureState


@Composable
fun BarometricPressureWidget(state: BarometricPressureState) {
    with (state) {
        WeatherDetailsSurface(
            content = {
                DetailsWidgetLabel(
                    icon = SharedRes.images.pressure_icon,
                    iconDesc = SharedRes.strings.pressure,
                    label = SharedRes.strings.pressure,
                )

                BarometerGauge(pressure ?: 0F)
            }
        )
    }
}