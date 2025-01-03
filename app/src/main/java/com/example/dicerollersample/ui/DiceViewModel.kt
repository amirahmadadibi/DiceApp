package com.example.dicerollersample.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DiceViewModel : ViewModel() {
    private val  _diceState = MutableStateFlow(1)
    val diceState = _diceState.asStateFlow()


    fun rollDice(){
        _diceState.value =  (1..6).random()
    }
}