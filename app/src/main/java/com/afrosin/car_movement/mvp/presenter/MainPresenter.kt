package com.afrosin.car_movement.mvp.presenter

import com.afrosin.car_movement.mvp.view.MainView
import com.afrosin.car_movement.navigation.Screens
import com.github.terrakok.cicerone.Router
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    @Inject
    lateinit var router: Router

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.newRootScreen(Screens.carMovingFragment())
    }

}