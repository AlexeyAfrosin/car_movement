package com.afrosin.car_movement.di.module

import com.afrosin.car_movement.mvp.resource.ResourceProvider
import com.afrosin.car_movement.ui.App
import com.afrosin.car_movement.ui.resource.AndroidResourceProvider
import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
class RepoModule {
    @Singleton
    @Provides
    fun resourceProvider(app: App): ResourceProvider {
        return AndroidResourceProvider(app)
    }


}