package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) : Engine {
    private val TAG = javaClass.simpleName
    override fun start() {
        Log.d(
            TAG,
            "Petrol engine started. \n" +
                    "Horsepower: $horsePower \n" +
                    "Engine capacity: $engineCapacity"
        )
    }
}