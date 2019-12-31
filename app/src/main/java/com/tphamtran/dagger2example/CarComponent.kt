package com.tphamtran.dagger2example

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}