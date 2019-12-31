package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.car.DieselEngine
import com.tphamtran.dagger2example.car.Engine
import dagger.Module
import dagger.Provides

//@Module
//class DieselEngineModule {
//
//    @Provides
//    fun provideEngine(engine: DieselEngine) : Engine = engine
//
//}

@Module
class DieselEngineModule (private val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int = horsePower

    // Don't rely on Smart Cast too much, bro!! this method should return Engine (interface)
    // Without explicit say so, Kotlin compiler will inference based on the the return value (DieselEngine)
    // Dagger can't find the correct Module >> Crash
    @Provides
    fun provideEngine(engine: DieselEngine): Engine = engine
}