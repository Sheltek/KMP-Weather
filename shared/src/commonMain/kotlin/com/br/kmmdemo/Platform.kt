package com.br.kmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform