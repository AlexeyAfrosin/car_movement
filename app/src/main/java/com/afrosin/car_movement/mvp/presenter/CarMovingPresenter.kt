package com.afrosin.car_movement.mvp.presenter

import com.afrosin.car_movement.mvp.view.CarMovingView
import moxy.MvpPresenter

class CarMovingPresenter : MvpPresenter<CarMovingView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()

    }

}