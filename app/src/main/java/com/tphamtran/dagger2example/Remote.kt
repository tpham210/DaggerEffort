package com.tphamtran.dagger2example

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    private val TAG = javaClass.simpleName
    fun setListener(car: Car) = Log.d(TAG, "Remote connected")
}
