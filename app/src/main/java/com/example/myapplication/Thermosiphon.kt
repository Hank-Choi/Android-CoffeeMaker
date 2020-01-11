package com.example.myapplication

import javax.inject.Inject

class Thermosiphon : Pump {
    val heater: Heater
    override fun pump() {
        if (heater.isHot()) {
            println("=> => pumping => =>")
        }
    }

    @Inject
    constructor(heater: Heater) {
        this.heater = heater
    }
}