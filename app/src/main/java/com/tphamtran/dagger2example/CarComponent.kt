package com.tphamtran.dagger2example

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}