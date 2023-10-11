package com.br.kmmdemo

import io.ktor.client.HttpClient

expect class Platform() {
    val name: String
    val client: HttpClient
}