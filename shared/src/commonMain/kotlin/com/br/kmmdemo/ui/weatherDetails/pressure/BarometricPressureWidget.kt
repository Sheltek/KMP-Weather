
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Colors
import com.br.kmmdemo.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsSurface
import com.br.kmmdemo.ui.weatherDetails.pressure.BarometricPressureState

@Composable
fun BarometricPressureWidget(state: BarometricPressureState) {
    val themeTertiary = Colors.onTertiary
    WeatherDetailsSurface(
        content = {
            DetailsWidgetLabel(
                icon = SharedRes.images.pressure_icon,
                iconDesc = SharedRes.strings.pressure,
                label = SharedRes.strings.pressure,
            )

            val gaugeSize = 100.dp
            Canvas(modifier = Modifier.fillMaxWidth().height(42.dp).padding(horizontal = 16.dp, vertical = 12.dp)) {
                val diameter = gaugeSize.toPx()
                val strokeWidth = 34f // Define the stroke width
                val topLeft = Offset((gaugeSize.toPx() - diameter) / 2, (gaugeSize.toPx() - diameter) / 2)
                val dashPattern = floatArrayOf(4f, 12f) // Define the dash pattern for the dashed circle

                // Draw the dashed background circle
                drawArc(
                    color = themeTertiary,
                    startAngle = 0f,
                    sweepAngle = 360f,
                    useCenter = true,
                    size = Size(gaugeSize.toPx(), gaugeSize.toPx()),
                    style = Stroke(width = strokeWidth, pathEffect = PathEffect.dashPathEffect(dashPattern, phase = 20F))
                )


                state.pressure?.let { pressure ->
                    // Create a sweep gradient brush
                    val gradient = Brush.sweepGradient(
                        listOf(Color.Red, Color.Green, Color.Blue, Color.Transparent)
                    )

                    // Draw the progress arc with the gradient
                    rotate(degrees = pressure) {
                        drawArc(
                            brush = gradient,
                            startAngle = -pressure,
                            sweepAngle = 90F,
                            useCenter = false,
                            topLeft = topLeft,
                            size = Size(gaugeSize.toPx(), gaugeSize.toPx()),
                            style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
                        )
                    }
                }
            }
        }
    )
}