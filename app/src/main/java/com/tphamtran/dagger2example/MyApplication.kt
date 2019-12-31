package com.tphamtran.dagger2example

import android.app.Application
import com.tphamtran.dagger2example.dagger.AppComponent
import com.tphamtran.dagger2example.dagger.DaggerAppComponent

class MyApplication: Application() {

    private lateinit var sppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        sppComponent = DaggerAppComponent.create()
    }

    fun getAppComponent() = sppComponent
}