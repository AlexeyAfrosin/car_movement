package com.afrosin.car_movement.navigation

import com.afrosin.car_movement.ui.fragment.CarMovingFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {

    fun carMovingFragment() =
        FragmentScreen { CarMovingFragment.newInstance() }
}