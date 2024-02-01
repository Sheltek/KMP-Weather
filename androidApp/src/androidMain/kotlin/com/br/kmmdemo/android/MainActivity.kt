package com.br.kmmdemo.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.fragment.app.FragmentActivity
import com.bottlerocketstudios.launchpad.compose.navigation.NavigationWrapper
import com.bottlerocketstudios.launchpad.compose.navigation.util.createDevicePostureFlow
import com.bottlerocketstudios.launchpad.compose.navigation.util.getWindowWidthSize
import com.bottlerocketstudios.launchpad.compose.navigation.utils.DevicePosture
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.ui.app.KMPDemoApp
import com.br.kmmdemo.ui.app.kmpDemoAppNavItems
import kotlinx.coroutines.flow.StateFlow
import moe.tlaster.precompose.PreComposeApp
import org.koin.core.component.KoinComponent

class MainActivity : FragmentActivity(), KoinComponent {
    private val devicePostureFlow: StateFlow<DevicePosture> = createDevicePostureFlow()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreComposeApp {
                KMMTheme {
                    NavigationWrapper(
                        widthSize = getWindowWidthSize(this@MainActivity),
                        devicePosture = devicePostureFlow.collectAsState().value,
                        navigationItems = kmpDemoAppNavItems,
                    ) { navigator, bottomBar ->
                        KMPDemoApp(
                            widthSize = getWindowWidthSize(this),
                            navigator = navigator,
                            devicePosture = devicePostureFlow.collectAsState().value,
                            bottomBar = bottomBar
                        )
                    }
                }
            }
        }
    }
}