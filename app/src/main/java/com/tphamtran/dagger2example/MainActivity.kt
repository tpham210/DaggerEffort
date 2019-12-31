package com.tphamtran.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tphamtran.dagger2example.car.Car
import com.tphamtran.dagger2example.dagger.CarComponent
import com.tphamtran.dagger2example.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    private lateinit var carComponent: CarComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponent = DaggerCarComponent
            .builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()

        carComponent.inject(this)
        car.drive()
    }
}
