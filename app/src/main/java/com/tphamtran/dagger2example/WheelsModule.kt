package com.tphamtran.dagger2example

import dagger.Module
import dagger.Provides

/**
 * Annotates a class that contributes to the object graph.
 */
@Module
class WheelsModule {
    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}