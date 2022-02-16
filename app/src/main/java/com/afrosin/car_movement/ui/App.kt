package com.afrosin.car_movement.ui

import android.app.Application
import com.afrosin.car_movement.di.AppComponent
import com.afrosin.car_movement.di.DaggerAppComponent
import com.afrosin.car_movement.di.module.AppModule

class App : Application() {
    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        instance = this

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

    }
}