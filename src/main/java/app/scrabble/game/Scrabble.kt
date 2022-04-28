package app.scrabble.game

import app.scrabble.rules.*
import app.scrabble.word.Score
import app.scrabble.word.Word

class Scrabble(private val rule: Rule) {
    companion object {
        fun scrabbleWithDefaultRules(): Scrabble = Scrabble(Rules(listOf(UniqueLetter(), Bingo(), LetterValue())))
    }

    fun computeScore(word: Word): Score = rule.calculateScore(word)
}

fun main() {
    val game = Scrabble.scrabbleWithDefaultRules()
    println(game.computeScore(Word("Paul")).compute())
}
