package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    val wheels: Wheels,
    val engine: Engine
) {
    private val TAG = javaClass.simpleName

    // Dagger only execute this after the constructor finishes
    // This mean we don't have to call this method. Dagger do this for us
    // So Dagger will create Remote & execute this method.
    @Inject
    internal fun enableRemote(remote: Remote) = remote.setListener(this)

    internal fun drive() {
        engine.start()
        Log.d(TAG, "driving...!")
    }
}