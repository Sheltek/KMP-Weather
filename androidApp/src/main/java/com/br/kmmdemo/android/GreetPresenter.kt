package com.br.kmmdemo.android

import com.br.kmmdemo.Greeting

class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}