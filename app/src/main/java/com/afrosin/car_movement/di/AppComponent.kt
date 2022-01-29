package com.afrosin.car_movement.di

import com.afrosin.car_movement.di.module.AppModule
import com.afrosin.car_movement.di.module.RepoModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RepoModule::class
    ]
)
interface AppComponent {

}