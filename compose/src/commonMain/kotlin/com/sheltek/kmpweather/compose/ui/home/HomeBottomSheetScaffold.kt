package com.sheltek.kmpweather.compose.ui.home

import PermissionsDialog
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetValue
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.sheltek.kmpweather.compose.resources.theme.Colors
import com.sheltek.kmpweather.compose.resources.theme.largeCardCorner
import com.sheltek.kmpweather.compose.ui.utils.SHEET_PEEK_HEIGHT
import dev.icerock.moko.permissions.Permission
import dev.icerock.moko.permissions.PermissionsController
import dev.icerock.moko.permissions.compose.PermissionsControllerFactory
import dev.icerock.moko.permissions.compose.rememberPermissionsControllerFactory

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeBottomSheetScaffold(state: HomeState) {
    val sheetState = rememberBottomSheetScaffoldState()
    val isExpanded = sheetState.bottomSheetState.currentValue == SheetValue.Expanded

    val factory: PermissionsControllerFactory = rememberPermissionsControllerFactory()
    val controller: PermissionsController = remember(factory) { factory.createPermissionsController() }
    var locationPermissionGranted by remember { mutableStateOf(false) }

    LaunchedEffect(true) {
        locationPermissionGranted = controller.isPermissionGranted(Permission.LOCATION) ||
                controller.isPermissionGranted(Permission.COARSE_LOCATION)

        // If location permissions were previously granted, onDismiss function is called that
        // will get users current location
        if (locationPermissionGranted) {
            state.locationPermissionsDialog.onDismiss(true)
        }
    }

    // IF location permissions have not been granted, start the permissions flow
    AnimatedVisibility(!locationPermissionGranted && state.shouldShowPermissionsDialog.value) {
        PermissionsDialog(
            permissionDialogState = state.locationPermissionsDialog,
            permissionsController = controller,
            permissionTypes = listOf(Permission.LOCATION, Permission.COARSE_LOCATION)
        )
    }

    BottomSheetScaffold(
        modifier = Modifier.fillMaxHeight(),
        scaffoldState = sheetState,
        content = { HomeScreen(state, isExpanded) },
        sheetPeekHeight = SHEET_PEEK_HEIGHT.dp,
        sheetDragHandle = null,
        topBar = null,
        sheetShape = if (isExpanded) RectangleShape else RoundedCornerShape(
            topStart = largeCardCorner,
            topEnd = largeCardCorner,
        ),
        sheetContainerColor = Colors.secondary,
        sheetContent = { HomeBottomSheet(state, isExpanded) })
}