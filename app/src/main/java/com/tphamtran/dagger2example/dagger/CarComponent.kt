package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.MainActivity
import com.tphamtran.dagger2example.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}