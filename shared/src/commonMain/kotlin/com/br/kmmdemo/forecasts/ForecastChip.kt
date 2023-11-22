import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.kmpLightColors

@Composable
fun ForecastChip(isSelected: Boolean, content: @Composable ColumnScope.() -> Unit) {
    val borderColorOpacity = if (isSelected) 0.5f else 0.2f
    val backgroundColor = if (isSelected) kmpLightColors.primary else kmpLightColors.primary.copy(alpha = 0.2f)
    Column(
        modifier = Modifier
            .shadow(
                elevation = Dimens.grid_1_25,
                spotColor = Color.Black.copy(alpha = 0.64f), // TODO: Extract Color
                ambientColor = Color.Black.copy(alpha = 0.64f) // TODO: Extract Color
            )
            .border(
                width = 1.dp,
                color = kmpLightColors.outline.copy(alpha = borderColorOpacity),
                shape = RoundedCornerShape(Dimens.grid_3_75)
            )
            .width(60.dp)
            .height(146.dp)
            .background(color = backgroundColor, shape = RoundedCornerShape(Dimens.grid_3_75))
            .padding(horizontal = Dimens.grid_1, vertical = Dimens.grid_2),
        verticalArrangement = Arrangement.spacedBy(Dimens.grid_1, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content,
    )
}