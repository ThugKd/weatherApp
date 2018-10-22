package com.example.dell.weatherapp.domain

/**
 * @author : Dell
 * @date : 2018/10/22.
 */

interface Command<T> {
    fun execute(): T
}