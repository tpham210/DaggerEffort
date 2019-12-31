package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.car.Engine
import com.tphamtran.dagger2example.car.PetrolEngine
import dagger.Binds
import dagger.Module

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */

//@Module
//class PetrolEngineModule {
//
//    @Provides
//    fun provideEngine(engine: PetrolEngine) : Engine = engine
//
//}

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}