package com.br.kmpdemo.android

import KmpLocationProvider
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.fragment.app.FragmentActivity
import com.br.kmpdemo.compose.resources.theme.KmpDemoTheme
import com.br.kmpdemo.compose.ui.app.KmpNavBar
import com.br.kmpdemo.ui.app.KmpWeatherApp
import com.br.kmpdemo.ui.app.kmpDemoAppNavItems
import com.sheltek.kwikstart.compose.navigation.NavigationWrapper
import com.sheltek.kwikstart.compose.navigation.util.createDevicePostureFlow
import com.sheltek.kwikstart.compose.navigation.util.getWindowWidthSize
import com.sheltek.kwikstart.compose.navigation.utils.DevicePosture
import kotlinx.coroutines.flow.StateFlow
import moe.tlaster.precompose.PreComposeApp
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class MainActivity : FragmentActivity(), KoinComponent {
    private val devicePostureFlow: StateFlow<DevicePosture> = createDevicePostureFlow()
    private val locationProvider: KmpLocationProvider by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        locationProvider.init()
        setContent {
            PreComposeApp {
                KmpDemoTheme {
                    NavigationWrapper(
                        widthSize = getWindowWidthSize(this@MainActivity),
                        devicePosture = devicePostureFlow.collectAsState().value,
                        navigationItems = kmpDemoAppNavItems,
                    ) { navigator, _ ->
                        KmpWeatherApp(
                            widthSize = getWindowWidthSize(this),
                            navigator = navigator,
                            devicePosture = devicePostureFlow.collectAsState().value,
                            bottomBar = { KmpNavBar() }
                        )
                    }
                }
            }
        }
    }
}