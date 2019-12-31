package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.MainActivity
import com.tphamtran.dagger2example.car.Car
import com.tphamtran.dagger2example.scope.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */
@ActivityScope
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

//    @Subcomponent.Builder
//    interface Builder {
//
////        @BindsInstance
////        fun horsePower(@Named("horsePower") horsePower: Int): Builder
////
////        @BindsInstance
////        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder
//
//        fun horsePower(@BindsInstance @Named("horsePower") horsePower: Int): Builder
//        fun engineCapacity( @BindsInstance @Named("engineCapacity") engineCapacity: Int): Builder
//
//        fun build(): ActivityComponent
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horsePower") horsePower: Int,
                   @BindsInstance @Named("engineCapacity") engineCapacity: Int): ActivityComponent
    }
}