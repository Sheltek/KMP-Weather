package com.br.kmmdemo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.heatmaps.WeightedLatLng

@Composable
actual fun WeatherMapScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.padding(it)) {
            item {
                var uiSettings by remember { mutableStateOf(MapUiSettings()) }
                var properties by remember {
                    mutableStateOf(MapProperties(mapType = MapType.SATELLITE))
                }

                val data = WeightedLatLng(LatLng(32.949480, -96.823970), 2.0)
                val weightedLatLngs = ArrayList<WeightedLatLng>()
                weightedLatLngs.add(data)

                Box(Modifier.fillMaxSize()) {
                    GoogleMap(
                        modifier = Modifier.matchParentSize(),
                        properties = properties,
                        uiSettings = uiSettings,
                        onMapLoaded = {
//                            TileOverlay(
//                                tileProvider = HeatmapTileProvider.Builder().weightedData(weightedLatLngs).build(),
//                                state = rememberTileOverlayState(),
//                                fadeIn = true,
//                                transparency = 0f,
//                                visible = true,
//                                zIndex = 0f,
//                                onClick = {},
//                            )
                        }
                    )
                    Switch(
                        checked = uiSettings.myLocationButtonEnabled,
                        onCheckedChange = {
                            uiSettings = uiSettings.copy(myLocationButtonEnabled = it)
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun WeatherHomePreview() {
    WeatherMapScreen()
}