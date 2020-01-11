package com.example.myapplication

import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {
    @Binds
    abstract fun providePump(pump: Thermosiphon): Pump
}