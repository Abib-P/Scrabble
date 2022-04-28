package app

import app.scrabble.game.Scrabble
import app.scrabble.word.Word

fun main() {
    val game = Scrabble.scrabbleWithDefaultRules()
    println(game.computeScore(Word("Paul")).compute())
}
