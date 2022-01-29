package com.afrosin.car_movement.ui.resource

import android.content.Context
import com.afrosin.car_movement.mvp.resource.ResourceProvider


class AndroidResourceProvider(private val context: Context) : ResourceProvider {

    override fun getAppContext(): Context = context
}