package com.afrosin.car_movement.di.module

import com.afrosin.car_movement.ui.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {
    @Provides
    fun app(): App {
        return app
    }
}