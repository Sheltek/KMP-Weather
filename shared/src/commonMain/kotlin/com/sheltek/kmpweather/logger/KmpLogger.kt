package com.sheltek.kmpweather.logger

interface KmpLogger {

    fun i(tag: String, message: String)

    fun d(tag: String, message: String)

    fun e(tag: String, message: String)
}