package com.allrossusianmedials.appsrosmediasa

import android.app.Application
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config =
            YandexMetricaConfig.newConfigBuilder("945d7e55-6100-4c7a-8a32-f3b05f396c0a").build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
    }
}