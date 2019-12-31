package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() :
    Engine {
    private val TAG = javaClass.simpleName

    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }
}