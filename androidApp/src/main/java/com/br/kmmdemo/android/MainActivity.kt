package com.br.kmmdemo.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.br.kmmdemo.viewmodels.ForecastViewModel
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val presenter: GreetPresenter by inject()
    private val forecastViewModel: ForecastViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingView(presenter.print())
                    ButtonLayoutView(forecastViewModel)
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Composable
fun ButtonLayoutView(forecastViewModel: ForecastViewModel) {
    val uiState = forecastViewModel.forecast.collectAsState()
    TextButton(onClick = {
        forecastViewModel.fetchForecast()
    }) {
        Text(text = uiState.value?.locationDto?.lat.toString())
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
