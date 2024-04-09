package com.sheltek.kmpweather.compose.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sheltek.kmpweather.compose.previews.utils.MockData
import com.sheltek.kmpweather.compose.resources.theme.KmpWeatherTheme
import com.sheltek.kmpweather.compose.ui.app.KmpNavBar
import com.sheltek.kmpweather.compose.ui.home.HomeBottomSheet
import com.sheltek.kmpweather.compose.ui.home.HomeCurrentWeather
import com.sheltek.kmpweather.compose.ui.home.HomeScreen

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview() {
    KmpWeatherTheme {
        HomeScreen(MockData.getMockHomeState(), true)
    }
}

@Preview
@Composable
private fun BottomSheetPreview() {
    KmpWeatherTheme {
        HomeBottomSheet(state = MockData.getMockHomeState(), true)
    }
}

@Composable
@Preview
fun NavBarPreview() {
    KmpWeatherTheme {
        KmpNavBar()
    }
}

@Composable
@Preview
fun HomeCurrentWeatherPreview() {
    KmpWeatherTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState(), true)
        }
    }
}

@Composable
@Preview
fun HomeCurrentWeatherERRORPreview() {
    KmpWeatherTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState(isError = true), true)
        }
    }
}