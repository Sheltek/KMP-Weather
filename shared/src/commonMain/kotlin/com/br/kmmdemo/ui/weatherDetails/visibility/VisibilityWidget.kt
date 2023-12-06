import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.letterSpacing
import com.br.kmmdemo.ui.weatherDetails.DetailsWidgetLabel
import com.br.kmmdemo.ui.weatherDetails.WeatherDetailsSurface
import com.br.kmmdemo.ui.weatherDetails.visibility.VisibilityState
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun VisibilityWidget(visibilityState: VisibilityState) {
    val averageVisibility = if (visibilityState.useMetric) SharedRes.strings.visibility_km else SharedRes.strings.visibility_miles
    WeatherDetailsSurface(
        content = {
            DetailsWidgetLabel(
                icon = SharedRes.images.visibility_icon,
                iconDesc = SharedRes.strings.visibility,
                label = SharedRes.strings.visibility,
            )

            Text(
                visibilityState.currentVisibility
                    ?: stringResource(SharedRes.strings.empty_digits_error),
                modifier = Modifier.padding(top = Dimens.grid_2),
                style = MaterialTheme.typography.titleLarge.letterSpacing(0.96.sp)
            )

            Text(
                stringResource(averageVisibility),
                modifier = Modifier.padding(top = Dimens.grid_3),
                style = MaterialTheme.typography.labelLarge
            )
        }
    )
}