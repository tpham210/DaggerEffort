package com.tphamtran.dagger2example

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    val wheels: Wheels
) {
    private val TAG = javaClass.simpleName

    @Inject
    internal lateinit var engine: Engine

    // Dagger only execute this after the constructor finishes
    // This mean we don't have to call this method. Dagger do this for us
    // So Dagger will create Remote & execute this method.
    @Inject
    internal fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    internal fun drive() {
        Log.d(TAG, "driving...!")
    }
}