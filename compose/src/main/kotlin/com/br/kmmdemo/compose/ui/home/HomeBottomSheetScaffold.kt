package com.br.kmmdemo.compose.ui.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.theme.Colors
import com.br.kmmdemo.theme.largeCardCorner

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeBottomSheetScaffold(
    state: HomeState,
    homeScreen: @Composable (PaddingValues) -> Unit
) {
    val sheetState = rememberBottomSheetScaffoldState()

    BottomSheetScaffold(
        scaffoldState = sheetState,
        content = homeScreen,
        sheetPeekHeight = 340.dp,
        sheetDragHandle = null,
        topBar = null,
        sheetShape = RoundedCornerShape(topStart = largeCardCorner, topEnd = largeCardCorner),
        sheetContainerColor = Colors.secondary.copy(alpha = 0.90F),
        sheetContent = { HomeBottomSheet(state) })
}

