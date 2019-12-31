package com.tphamtran.dagger2example

import android.app.Application
import com.tphamtran.dagger2example.dagger.AppComponent
import com.tphamtran.dagger2example.dagger.DaggerAppComponent
import com.tphamtran.dagger2example.dagger.DriverModule

class MyApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerAppComponent.create()
        appComponent = DaggerAppComponent.factory().create(DriverModule("T"))
    }

    fun getAppComponent() = appComponent
}