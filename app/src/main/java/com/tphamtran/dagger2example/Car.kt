package com.tphamtran.dagger2example

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {
    private val TAG = javaClass.simpleName

    fun drive() {
        Log.d(TAG, "driving...!")
    }
}