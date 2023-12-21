
import androidx.compose.runtime.Composable
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsSurface
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState

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