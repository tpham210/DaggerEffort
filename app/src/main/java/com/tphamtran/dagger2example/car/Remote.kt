package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */
class Remote @Inject constructor(){
    private val TAG = javaClass.simpleName
    fun setListener(car: Car) = Log.d(TAG, "Remote connected")
}
