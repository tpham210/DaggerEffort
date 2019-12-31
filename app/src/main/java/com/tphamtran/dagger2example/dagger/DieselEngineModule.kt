package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.car.DieselEngine
import com.tphamtran.dagger2example.car.Engine
import dagger.Binds
import dagger.Module

//@Module
//class DieselEngineModule {
//
//    @Provides
//    fun provideEngine(engine: DieselEngine) : Engine = engine
//
//}

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}