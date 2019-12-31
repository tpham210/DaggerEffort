package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine (private val horsePower: Int) : Engine {
    private val TAG = javaClass.simpleName

    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $horsePower")
    }
}