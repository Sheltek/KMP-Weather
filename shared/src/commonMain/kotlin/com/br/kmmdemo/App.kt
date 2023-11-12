package com.br.kmmdemo

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.br.kmmdemo.resources.SharedRes
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.stringResource
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition

@Composable
fun App(darkTheme: Boolean = false) {
    val navigator = rememberNavigator()

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(navigator) },
    ) {
        KMMTheme(darkTheme = darkTheme) {
            NavHost(
                // Assign the navigator to the NavHost
                navigator = navigator,
                // Navigation transition for the scenes in this NavHost, this is optional
                navTransition = NavTransition(),
                // The start destination
                initialRoute = "/home",
                modifier = Modifier.padding(it)
            ) {
                navGraph()
            }
        }
    }
}

@Composable
fun BottomBar(navigator: Navigator) {
    NavigationBar(Modifier.fillMaxWidth().height(72.dp)) {
        NavigationBarItem(
            selected = false,
            label = {
                Text(
                    text = stringResource(SharedRes.strings.home),
                    fontFamily = fontFamilyResource(SharedRes.fonts.Montserrat.medium)
                )
            },
            onClick = { navigator.navigate("/home") },
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "") }
        )
        NavigationBarItem(
            selected = false,
            label = {
                Text(
                    text = stringResource(SharedRes.strings.map),
                    fontFamily = fontFamilyResource(SharedRes.fonts.Montserrat.medium)
                )
            },
            onClick = { navigator.navigate("/map") },
            icon = { Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "") }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() {
    TopAppBar(
        title = { Text(stringResource(SharedRes.strings.appName)) }
    )
}
