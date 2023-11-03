package com.br.kmmdemo

actual class StringHelper actual constructor(actual val content: String) {
    actual operator fun invoke(vararg args: Any?) = content.format(args)
}