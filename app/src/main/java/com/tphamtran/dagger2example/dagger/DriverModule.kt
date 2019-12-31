package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//
//@Module
//abstract class DriverModule {
//
//    @Module
//    companion object DriverModule {
//
//        @JvmStatic
//        @Singleton
//        @Provides
//        fun provideDriver(): Driver = Driver()
//    }
//}
@Module
data class DriverModule(val driverName: String) {

    @Singleton
    @Provides
    fun provideDriver(): Driver = Driver(driverName)
}