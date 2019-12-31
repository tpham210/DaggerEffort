package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.MainActivity
import com.tphamtran.dagger2example.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}