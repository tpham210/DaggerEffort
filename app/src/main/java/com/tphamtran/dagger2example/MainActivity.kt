package com.tphamtran.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
    private lateinit var carComponent: CarComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()
    }
}
