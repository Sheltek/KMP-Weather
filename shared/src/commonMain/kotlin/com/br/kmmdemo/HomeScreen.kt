package com.br.kmmdemo

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.stringResource


@Composable
fun HomeScreen() {
    Surface(
        color = Color.Blue,
        modifier = Modifier.fillMaxWidth().fillMaxHeight()
    ) {
        Text(
            stringResource(SharedRes.strings.appName),
            color = Color.Cyan,
            fontSize = 24.sp,
            fontFamily = fontFamilyResource(SharedRes.fonts.Montserrat.medium),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp),
        )
    }
}