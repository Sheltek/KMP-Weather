package com.br.kmmdemo.ui.shared

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.theme.Dimens
import com.br.kmmdemo.theme.Gradients
import com.br.kmmdemo.theme.outline
import com.br.kmmdemo.utils.gradientCardModifier

@Composable
fun GradientCard(content: @Composable () -> Unit) {
    Card(
        shape = RoundedCornerShape(15),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier.gradientCardModifier(
            sideGradientColors = Gradients.sideEclipseGradient,
            topGradientColors = Gradients.topEclipseGradient,
        ),
        border = BorderStroke(
            2.dp, Brush.verticalGradient(
                colors = listOf(outline, Color.Transparent),
                startY = 0f,
                endY = Dimens.grid_24.value
            )
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Box(
            modifier = Modifier
                .padding(
                    top = Dimens.grid_6,
                    bottom = Dimens.grid_16,
                    start = Dimens.grid_1_25,
                    end = Dimens.grid_0_5
                )
        ) {
            content()
        }
    }
}
