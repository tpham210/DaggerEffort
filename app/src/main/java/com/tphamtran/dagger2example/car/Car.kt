package com.tphamtran.dagger2example.car

import android.util.Log
import com.tphamtran.dagger2example.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
data class Car @Inject constructor(
    val wheels: Wheels,
    val engine: Engine,
    val driver: Driver
) {
    private val TAG = javaClass.simpleName

    // Dagger only execute this after the constructor finishes
    // This mean we don't have to call this method. Dagger do this for us
    // So Dagger will create Remote & execute this method.
    @Inject
    internal fun enableRemote(remote: Remote) = remote.setListener(this)

    internal fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }
}