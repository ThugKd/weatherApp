package com.example.dell.weatherapp

import com.google.gson.Gson
import java.net.URL

/**
 * @author : Dell
 * @date : 2018/10/22.
 */

class ForecastRequest(val zipCode: String) {
    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URLL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URLL&APPID=$APP_ID&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}