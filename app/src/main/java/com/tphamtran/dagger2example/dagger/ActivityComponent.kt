package com.tphamtran.dagger2example.dagger

import com.tphamtran.dagger2example.MainActivity
import com.tphamtran.dagger2example.car.Car
import com.tphamtran.dagger2example.scope.ActivityScope
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        // If you don't have "@Component.Builder", this method will be generated automatically
        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }
}