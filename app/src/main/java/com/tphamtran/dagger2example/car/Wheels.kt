package com.tphamtran.dagger2example.car

import android.util.Log

// We don't own this class so we can't annotate it with @Inject
data class Wheels(
    val rims: Rims,
    val tires: Tires
) {
    private val TAG = javaClass.simpleName
}

class Rims
class Tires {
    private val TAG = javaClass.simpleName
    fun inflate() = Log.d(TAG, "Tires inflated")
}