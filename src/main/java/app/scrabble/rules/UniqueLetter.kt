package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

class UniqueLetter : Rules {
    override fun calculateScore(word: Word): Score {
        if (word.value.uppercase().toList().distinct().size == word.value.length) {
            return Score(multiplicator = 2)
        }
        return Score()
    }
}
