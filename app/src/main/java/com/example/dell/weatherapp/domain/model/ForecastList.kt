package com.example.dell.weatherapp.domain.model

import com.example.dell.weatherapp.Forecast

/**
 * @author : Dell
 * @date : 2018/10/22.
 */

data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
    operator fun get(position: Int): Forecast = dailyForecast[position]

    fun size(): Int = dailyForecast.size
}
