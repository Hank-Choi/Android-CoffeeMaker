package com.example.myapplication

class ElectricHeater : Heater {
    var heating = false
    override fun on() {
        println("~ ~ ~ heating ~ ~ ~")
        this.heating = true
    }

    override fun off() {
        this.heating = false
    }

    override fun isHot():Boolean {
        return heating
    }

}