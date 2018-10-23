package com.example.dell.weatherapp

import android.app.Application

/**
 * @author : Dell
 * @date : 2018/10/23.
 */

class App : Application() {
    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}