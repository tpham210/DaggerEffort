package com.tphamtran.dagger2example.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * This work would not be possible without the dedicated work of Florian Walther
 * The owner of codinginflow.com website.
 *
 * Thank you, sir!
 *
 * With all due respect,
 * -T.
 */
class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) : Engine {
    private val TAG = javaClass.simpleName
    override fun start() {
        Log.d(
            TAG,
            "Petrol engine started. \n" +
                    "Horsepower: $horsePower \n" +
                    "Engine capacity: $engineCapacity"
        )
    }
}