package com.tphamtran.dagger2example.car

import android.util.Log

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */
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