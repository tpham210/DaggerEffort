package com.tphamtran.dagger2example

import android.app.Application
import com.tphamtran.dagger2example.dagger.AppComponent
import com.tphamtran.dagger2example.dagger.DaggerAppComponent
import com.tphamtran.dagger2example.dagger.DriverModule

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */

class MyApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerAppComponent.create()
        appComponent = DaggerAppComponent.factory().create(DriverModule("T"))
    }

    fun getAppComponent() = appComponent
}