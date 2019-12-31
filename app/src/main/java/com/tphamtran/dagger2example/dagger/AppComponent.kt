package com.tphamtran.dagger2example.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */
@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }
}