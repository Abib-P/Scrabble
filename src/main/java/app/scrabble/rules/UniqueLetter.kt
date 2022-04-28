package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

class UniqueLetter : Rule {
    override fun calculateScore(word: Word): Score {
        if (word.value.uppercase().toSet().size == word.value.length) {
            return Score(multiplicator = 2)
        }
        return Score()
    }
}
