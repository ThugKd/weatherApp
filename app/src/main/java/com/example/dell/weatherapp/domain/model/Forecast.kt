package com.example.dell.weatherapp.domain.model

/**
 * @author : Dell
 * @date : 2018/10/22.
 */
data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int, val iconUrl: String)