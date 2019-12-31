package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() :
    Engine {
    private val TAG = javaClass.simpleName
    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }
}