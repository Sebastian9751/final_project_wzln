package com.example.finalpy.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel(private val diceModel: DiceModel = DiceModel()) : ViewModel() {
    private val _diceValue: MutableLiveData<Int> = MutableLiveData()
    val diceValue: LiveData<Int> get() = _diceValue

    fun generateDiceValue() {
        _diceValue.value = diceModel.valueProducer()
    }
}