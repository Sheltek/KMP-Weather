
import androidx.compose.material3.ColorScheme
import com.sheltek.kmpweather.compose.resources.theme.Dimensions
import com.sheltek.kmpweather.compose.resources.theme.sw360Dimensions
import com.sheltek.kmpweather.utils.Constants.IS_METRIC
import com.sheltek.kmpweather.utils.MeasurementType
import org.koin.core.component.KoinComponent
import platform.Foundation.NSUserDefaults

actual fun getSystemDimensions(): Dimensions {
    // Return iOS-specific dimensions
    return sw360Dimensions
}

actual fun getSystemColorScheme(darkTheme: Boolean): ColorScheme {
    // Return iOS-specific color scheme
    return if (darkTheme) {
        com.sheltek.kmpweather.compose.resources.theme.kmpDarkColors
    } else {
        com.sheltek.kmpweather.compose.resources.theme.kmpLightColors
    }
}

actual object MeasurementPreference {
    private val userDefaults: NSUserDefaults = NSUserDefaults.standardUserDefaults

    actual var preference: MeasurementType
        get() = if (userDefaults.boolForKey(IS_METRIC)) MeasurementType.METRIC else MeasurementType.IMPERIAL
        set(value) {
            userDefaults.setBool(value == MeasurementType.METRIC, IS_METRIC)
            userDefaults.synchronize()
        }
}

actual class KmpLocationProvider: KoinComponent {
    actual suspend fun getUsersLocation() {
        // TODO: Implement using CLLocationManager
    }
}