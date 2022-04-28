package app.scrabble.game

import app.scrabble.rules.Bingo
import app.scrabble.rules.LetterValue
import app.scrabble.rules.Rules
import app.scrabble.rules.UniqueLetter
import app.scrabble.word.Score
import app.scrabble.word.Word

class Scrabble(private val rules: List<Rules>) {

    fun computeScore(word: Word): Score {
        return rules.map { it.calculateScore(word) }.reduce { score1, score2 -> score1 + score2 }
    }

    companion object {
        fun scrabbleWithDefaultRules(): Scrabble = Scrabble(listOf(UniqueLetter(), Bingo(), LetterValue()))
    }
}
