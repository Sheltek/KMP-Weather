package com.br.kmmdemo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator

@Composable
fun App(darkTheme: Boolean = false) {
    val navigator = rememberNavigator()

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(navigator) },
    ) {
        KMMTheme(darkTheme = darkTheme) {
            // TODO - NavHost
//            NavHost(
//                // Assign the navigator to the NavHost
//                navigator = navigator,
//                // Navigation transition for the scenes in this NavHost, this is optional
//                navTransition = NavTransition(),
//                // The start destination
//                initialRoute = "/home",
//            )
            HomeScreen(it)
        }
    }
}

@Composable
private fun HomeScreen(it: PaddingValues) {
    Surface(
        color = Color.Blue,
        modifier = Modifier.padding(it).fillMaxWidth().fillMaxHeight()
    ) {
        Text(
            "KMP Demo",
            color = Color.Cyan,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp),
        )
    }
}

@Composable
fun BottomBar(navigator: Navigator) {
    NavigationBar(Modifier.fillMaxWidth().height(72.dp)) {
        NavigationBarItem(
            selected = false,
            label = { Text("Home") },
//            onClick = { navigator.navigate("ASD")},
            onClick = { },
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "")  }
        )
        NavigationBarItem(
            selected = false,
            label = { Text("Map") },
//            onClick = { navigator.navigate("ASD")},
            onClick = { },
            icon = { Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "")  }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() {
    TopAppBar(
        title = { Text("KMP Demo")}
    )
}
