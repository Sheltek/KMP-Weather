package com.br.kmmdemo.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.resources.SharedRes
import com.br.kmmdemo.theme.Dimens
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource

const val FAB_BTN_SIZE = 102
const val FAB_BG_WIDTH = 258
const val FAB_BG_HEIGHT = 100
const val ALT_BTN_SIZE = 48

@Composable
fun NavBar(
    onAddClick: () -> Unit = {},
    onPinClick: () -> Unit = {},
    onListClick: () -> Unit = {},
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent),
        contentAlignment = Alignment.BottomCenter,
        content = {
            Image(
                painter = painterResource(SharedRes.images.nav_bar_background),
                contentDescription = stringResource(SharedRes.strings.nav_bar_bg),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth(),
                alignment = Alignment.BottomCenter
            )
            Image(
                painter = painterResource(SharedRes.images.nav_bar_button_bg),
                contentDescription = stringResource(SharedRes.strings.nav_bar_button_bg),
                modifier = Modifier.width(FAB_BG_WIDTH.dp).height(FAB_BG_HEIGHT.dp),
                alignment = Alignment.BottomCenter
            )
            Image(
                painter = painterResource(SharedRes.images.nav_bar_button),
                contentDescription = stringResource(SharedRes.strings.nav_bar_button),
                modifier = Modifier
                    .size(FAB_BTN_SIZE.dp)
                    .clickable { onAddClick() },
                alignment = Alignment.Center
            )

            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(
                        vertical = Dimens.grid_1_5,
                        horizontal = Dimens.grid_3,
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                content = {
                    Image(
                        painter = painterResource(SharedRes.images.nav_bar_pin_button),
                        contentDescription = stringResource(SharedRes.strings.nav_bar_pin_button),
                        modifier = Modifier
                            .size(ALT_BTN_SIZE.dp)
                            .clickable { onPinClick() },
                        alignment = Alignment.CenterStart,
                    )
                    Image(
                        painter = painterResource(SharedRes.images.nav_bar_list_button),
                        contentDescription = stringResource(SharedRes.strings.nav_bar_list_button),
                        modifier = Modifier
                            .size(ALT_BTN_SIZE.dp)
                            .clickable { onListClick() },
                        alignment = Alignment.CenterEnd
                    )
                }
            )
        }
    )
}