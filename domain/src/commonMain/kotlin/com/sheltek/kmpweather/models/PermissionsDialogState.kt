package com.sheltek.kmpweather.models

data class PermissionsDialogState(
    val permissionText: String,
    val onDismiss: (Boolean) -> Unit,
)
