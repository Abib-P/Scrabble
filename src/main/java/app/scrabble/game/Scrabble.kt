package app.scrabble.game

import app.scrabble.rules.Bingo
import app.scrabble.rules.LetterValue
import app.scrabble.rules.Rules
import app.scrabble.rules.UniqueLetter
import app.scrabble.word.Word

class Scrabble {
    private var rules: List<Rules> = listOf(UniqueLetter(), Bingo(), LetterValue())

    fun applyRules(word: Word): Int {
        rules.forEach { it.applyRule(word) }
        return word.getScore()
    }
}
