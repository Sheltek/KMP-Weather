package com.br.kmpdemo.models

data class PermissionsDialogState(
    val permissionText: String,
    val onDismiss: (Boolean) -> Unit,
)
