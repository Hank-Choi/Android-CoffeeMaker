package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }



    @Test
    fun asdfgt() {
        val coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build()
        coffeeShop.maker().brew()
    }
}
