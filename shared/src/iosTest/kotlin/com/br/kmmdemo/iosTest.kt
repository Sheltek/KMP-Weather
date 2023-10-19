package com.br.kmmdemo

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        val testFormat = "This is a decimal: %d"

        val helper = StringHelper(testFormat)

        val value = helper(1)

        assertTrue(value == "This is a decimal: 1",   "Fail")
    }
}