package com.example.dell.weatherapp.domain

import com.example.dell.weatherapp.ForecastRequest
import com.example.dell.weatherapp.domain.model.ForecastList

/**
 * @author : Dell
 * @date : 2018/10/22.
 */
class RequestForecastCommand(private val zipCode: String) :Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}