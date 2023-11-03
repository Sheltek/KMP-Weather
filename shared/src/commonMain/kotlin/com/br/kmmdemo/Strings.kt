package com.br.kmmdemo


expect class StringHelper(content: String) {
    val content: String

    operator fun invoke(vararg args: Any?): String
}


class Strings(stringMap: Map<String, Any?>) {
    val name: StringHelper by stringMap
    val string2: StringHelper by stringMap
}

infix fun String.stringOf(content: String) = this to StringHelper(content)


val AppStrings = Strings(
    mapOf(
        "name" stringOf "My name:",
        "string2" stringOf "Second String %d",
    )
)


fun asd() {
    // Get a string
    val mystring: String = AppStrings.name()


}