package com.br.kmpdemo.android

import KmpLocationProvider
import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.core.app.ActivityCompat
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import com.bottlerocketstudios.launchpad.compose.navigation.NavigationWrapper
import com.bottlerocketstudios.launchpad.compose.navigation.util.createDevicePostureFlow
import com.bottlerocketstudios.launchpad.compose.navigation.util.getWindowWidthSize
import com.bottlerocketstudios.launchpad.compose.navigation.utils.DevicePosture
import com.br.kmpdemo.compose.resources.theme.KmpDemoTheme
import com.br.kmpdemo.compose.ui.app.KmpNavBar
import com.br.kmpdemo.ui.app.KMPDemoApp
import com.br.kmpdemo.ui.app.kmpDemoAppNavItems
import com.br.kmpdemo.utils.Constants.LOCATION_REQUEST_CODE
import com.google.android.gms.location.LocationServices
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import moe.tlaster.precompose.PreComposeApp
import org.koin.core.component.KoinComponent


class MainActivity : FragmentActivity(), KoinComponent {
    private val devicePostureFlow: StateFlow<DevicePosture> = createDevicePostureFlow()
    private val locationProvider: KmpLocationProvider = KmpLocationProvider()
    private val permissionsList = arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        locationProvider.init(LocationServices.getFusedLocationProviderClient(applicationContext))
        requestLocationPermissions()
        setContent {
            PreComposeApp {
                KmpDemoTheme {
                    NavigationWrapper(
                        widthSize = getWindowWidthSize(this@MainActivity),
                        devicePosture = devicePostureFlow.collectAsState().value,
                        navigationItems = kmpDemoAppNavItems,
                    ) { navigator, _ ->
                        KMPDemoApp(
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

    private fun requestLocationPermissions() = if (checkLocationPermissions()) {
        ActivityCompat.requestPermissions(this, permissionsList, LOCATION_REQUEST_CODE)
    } else {
        getUserLocation()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PERMISSION_GRANTED) {
                getUserLocation()
            }
        }
    }

    private fun getUserLocation() {
        lifecycleScope.launch {
            locationProvider.getUsersLocation()
        }
    }

    private fun checkLocationPermissions(): Boolean =
        ActivityCompat.checkSelfPermission(this, permissionsList[0]) != PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, permissionsList[1]) != PERMISSION_GRANTED
}