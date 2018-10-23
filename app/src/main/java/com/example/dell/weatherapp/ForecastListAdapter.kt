package com.example.dell.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dell.weatherapp.domain.model.ForecastBean
import com.example.dell.weatherapp.domain.model.ForecastList
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_forecast.view.*

/**
 * @author : Dell
 * @date : 2018/10/22.
 */
class ForecastListAdapter(val weekForecast: ForecastList,
                          val itemClick: (ForecastBean) -> Unit) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_forecast, p0, false)
        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindForecast(weekForecast[p1])
    }

    override fun getItemCount(): Int = weekForecast.size()

    class ViewHolder(view: View, val itemClick: (ForecastBean) -> Unit) :
            RecyclerView.ViewHolder(view) {
        fun bindForecast(forecast: ForecastBean) {
            with(forecast) {
                Picasso.with(itemView.context).load(iconUrl).into(itemView.icon)
                itemView.date.text = date
                itemView.description.text = description
                itemView.maxTemperature.text = "$high ℃"
                itemView.minTemperature.text = "$low ℃"
                itemView.setOnClickListener { itemClick(this) }
            }
        }
    }

    interface OnItemClickListener {
        operator fun invoke(forecast: ForecastBean)
    }
}