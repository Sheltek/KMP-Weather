package com.br.kmmdemo.compose.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.compose.previews.utils.MockData
import com.br.kmmdemo.compose.resources.theme.KMMTheme
import com.br.kmmdemo.compose.ui.app.KmpNavBar
import com.br.kmmdemo.compose.ui.home.HomeBottomSheet
import com.br.kmmdemo.compose.ui.home.HomeCurrentWeather
import com.br.kmmdemo.compose.ui.home.HomeScreen

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview() {
    KMMTheme {
        HomeScreen(MockData.getMockHomeState())
    }
}

@Preview
@Composable
private fun BottomSheetPreview() {
    KMMTheme {
        HomeBottomSheet(state = MockData.getMockHomeState())
    }
}

@Composable
@Preview
fun NavBarPreview() {
    KMMTheme {
        KmpNavBar()
    }
}

@Composable
@Preview
fun HomeCurrentWeatherPreview() {
    KMMTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState())
        }
    }
}

@Composable
@Preview
fun HomeCurrentWeatherERRORPreview() {
    KMMTheme {
        Surface {
            HomeCurrentWeather(MockData.getMockHomeState(isError = true))
        }
    }
}