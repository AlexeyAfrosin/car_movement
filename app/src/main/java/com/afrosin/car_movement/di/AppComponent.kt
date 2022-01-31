package com.afrosin.car_movement.di

import com.afrosin.car_movement.di.module.AppModule
import com.afrosin.car_movement.di.module.CiceroneModule
import com.afrosin.car_movement.di.module.RepoModule
import com.afrosin.car_movement.mvp.presenter.CarMovingPresenter
import com.afrosin.car_movement.mvp.presenter.MainPresenter
import com.afrosin.car_movement.ui.App
import com.afrosin.car_movement.ui.MainActivity
import com.afrosin.car_movement.ui.fragment.CarMovingFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RepoModule::class,
        CiceroneModule::class
    ]
)
interface AppComponent {
    fun inject(app: App)
    fun inject(mainActivity: MainActivity)
    fun inject(mainPresenter: MainPresenter)
    fun inject(carMovingFragment: CarMovingFragment)
    fun inject(carMovingPresenter: CarMovingPresenter)
}