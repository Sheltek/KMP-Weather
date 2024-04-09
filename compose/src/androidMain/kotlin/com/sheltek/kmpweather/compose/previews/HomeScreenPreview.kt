package com.sheltek.kmpweather.compose.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpDemoTheme
import com.sheltek.kmpweather.compose.ui.app.KmpNavBar
import com.sheltek.kmpweather.compose.ui.home.HomeBottomSheet
import com.sheltek.kmpweather.compose.ui.home.HomeCurrentWeather
import com.sheltek.kmpweather.compose.ui.home.HomeScreen

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview() {
    KmpDemoTheme {
        HomeScreen(MockData.getMockHomeState(), true)
    }
}

@Preview
@Composable
private fun BottomSheetPreview() {
    KmpDemoTheme {
        HomeBottomSheet(state = MockData.getMockHomeState(), true)
    }
}

@Composable
@Preview
fun NavBarPreview() {
    KmpDemoTheme {
        KmpNavBar()
    }
}

@Composable
@Preview
fun HomeCurrentWeatherPreview() {
    KmpDemoTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState(), true)
        }
    }
}

@Composable
@Preview
fun HomeCurrentWeatherERRORPreview() {
    KmpDemoTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState(isError = true), true)
        }
    }
}