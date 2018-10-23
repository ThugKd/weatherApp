package com.example.dell.weatherapp.domain.model

/**
 * @author : Dell
 * @date : 2018/10/22.
 */

data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<ForecastBean>) {
    operator fun get(position: Int) = dailyForecast[position]

    fun size() = dailyForecast.size
}
