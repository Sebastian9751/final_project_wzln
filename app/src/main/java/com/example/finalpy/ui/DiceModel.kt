package com.example.finalpy.ui

import kotlin.random.Random

class DiceModel {
    fun valueProducer(): Int {

        return Random.nextInt(1, 7)
    }
}