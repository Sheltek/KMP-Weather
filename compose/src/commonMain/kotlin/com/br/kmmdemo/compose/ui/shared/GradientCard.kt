package com.br.kmmdemo.compose.ui.shared

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.compose.resources.theme.Dimens
import com.br.kmmdemo.compose.resources.theme.Gradients
import com.br.kmmdemo.compose.resources.theme.largeCardCorner
import com.br.kmmdemo.compose.resources.theme.outline
import com.br.kmmdemo.compose.ui.utils.gradientCardModifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GradientCard(
    sheetState: SheetState,
    content: @Composable () -> Unit
) {
    val outlineAlpha = remember { Animatable(1f) }
    val outlineThickness = remember { mutableStateOf(2.dp) }
    // TODO: ASAA-117 refactor this logic
    LaunchedEffect(sheetState.currentValue) {
        val targetAlpha = if (sheetState.currentValue != SheetValue.PartiallyExpanded) 0f else 1f
        val targetThickness = if (sheetState.currentValue != SheetValue.PartiallyExpanded) 0.dp else 2.dp
        outlineAlpha.animateTo(targetValue = targetAlpha, animationSpec = tween(durationMillis = 300))
        outlineThickness.value = targetThickness
    }

    // TODO: ASAA-117 remove shape when sheet is expanded
    OutlinedCard(
        shape = RoundedCornerShape(largeCardCorner),
        modifier = Modifier
            .heightIn(min = 200.dp, max = 550.dp) // Prevents sheet from expanding too much
            .fillMaxSize()
            .gradientCardModifier(
                sideGradientColors = Gradients.sideEclipseGradient,
                topGradientColors = Gradients.topEclipseGradient,
            )
            .shadow(2.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = Color.Transparent
        ),
        border = BorderStroke(
            2.dp, Brush.verticalGradient(
                colors = listOf(outline.copy(alpha = outlineAlpha.value), Color.Transparent),
                startY = 0f,
                endY = Dimens.grid_24.value
            )
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .padding(
                    top = Dimens.grid_1_75,
                    bottom = Dimens.grid_1,
                )
        ) {
            content()
        }
    }
}