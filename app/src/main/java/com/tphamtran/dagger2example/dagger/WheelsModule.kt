package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.car.Rims
import com.tphamtran.dagger2example.car.Tires
import com.tphamtran.dagger2example.car.Wheels
import dagger.Module
import dagger.Provides

/**
 * Annotates a class that contributes to the object graph.
 */
@Module
abstract class WheelsModule {

    @Module
    companion object WheelsModule{
        @JvmStatic
        @Provides
        fun provideRims() = Rims()

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
    }

}