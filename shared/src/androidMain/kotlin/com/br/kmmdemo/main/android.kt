package com.br.kmmdemo.main

import androidx.compose.runtime.Composable
import com.br.kmmdemo.App
import com.br.kmmdemo.WeatherMapScreen

@Composable
fun MainView(width: Int) = App(false, width)

@Composable
fun WeatherMapView() = WeatherMapScreen()