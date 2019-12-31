package com.tphamtran.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tphamtran.dagger2example.car.Car
import com.tphamtran.dagger2example.dagger.ActivityComponent
import com.tphamtran.dagger2example.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car
    private lateinit var activityComponent: ActivityComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent = DaggerActivityComponent
            .builder()
            .horsePower(150)
            .engineCapacity(1400)
            .appComponent((application as MyApplication).getAppComponent())
            .build()

        activityComponent.inject(this)

        // Because we marked "Car" in the @ActivityScope, only one instance of the Car
        // exist during the Activity life cycle. Therefore, even though we create two objects
        // BUT there are the same instance referencing the same object if you look at the memory reference.
        car1.drive()
        car2.drive()
    }
}
