package com.br.kmmdemo.previews

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.previews.utils.MockData
import com.br.kmmdemo.theme.KMMTheme
import com.br.kmmdemo.ui.home.HomeBottomSheet
import com.br.kmmdemo.ui.home.HomeCurrentWeather
import com.br.kmmdemo.ui.home.HomeScreen
import com.br.kmmdemo.ui.home.NavBar

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
        NavBar()
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