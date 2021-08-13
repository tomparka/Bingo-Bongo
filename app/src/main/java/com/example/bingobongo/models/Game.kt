package com.example.bingobongo.models

import com.example.bingobongo.enums.GameType

class Game {
    var gameType = GameType.STANDARD
    var cards = arrayListOf<Card>()
    var numbersCalled = arrayListOf<Int>()

    fun numberCalled(number: Int) {
        cards.forEach({ card ->
            card.checkForNumber(number)
        })
        numbersCalled.add(number)
    }

    fun newGame(gameType: GameType) {
        this.gameType = gameType
        this.numbersCalled.clear()
        cards.forEach({ card ->
            card.clearCard()
        })
    }
}