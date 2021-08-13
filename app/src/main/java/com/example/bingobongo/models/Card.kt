package com.example.bingobongo.models

class Card {
    var winner = false
    var numbers = arrayOfNulls<Int>(24)

    fun checkForNumber(number: Int) {

    }

    fun checkWinner() {
        winner = true
    }

    fun clearCard() {
        TODO("Not yet implemented")
    }
}