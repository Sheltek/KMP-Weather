package com.br.kmmdemo.compose.ui.home

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.compose.resources.theme.Colors
import com.br.kmmdemo.compose.resources.theme.largeCardCorner

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeBottomSheetScaffold(state: HomeState) {
    val sheetState = rememberBottomSheetScaffoldState()

    BottomSheetScaffold(
        scaffoldState = sheetState,
        content = { HomeScreen(state) },
        sheetPeekHeight = 240.dp,
        sheetDragHandle = null,
        topBar = null,
        sheetShape = RoundedCornerShape(topStart = largeCardCorner, topEnd = largeCardCorner),
        sheetContainerColor = Colors.secondary.copy(alpha = 0.90F),
        sheetContent = { HomeBottomSheet(state) })
}

