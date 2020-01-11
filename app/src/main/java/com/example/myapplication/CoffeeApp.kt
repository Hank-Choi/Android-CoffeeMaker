package com.example.myapplication

import dagger.Component
import javax.inject.Singleton

class CoffeeApp {
    @Singleton
    @Component(
        modules = [DripCoffeeModule::class]
    )
    interface CoffeeShop {
        fun maker(): CoffeeMaker
    }


}

