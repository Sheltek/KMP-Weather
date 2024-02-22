import androidx.compose.material3.ColorScheme
import com.br.kmpdemo.compose.resources.theme.Dimensions

expect fun getSystemDimensions(): Dimensions
expect fun getSystemColorScheme(darkTheme: Boolean): ColorScheme