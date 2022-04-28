package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

class Bingo : Rules {
    override fun calculateScore(word: Word): Score {
        if (word.value.length == 7) {
            return Score(bonus = 50)
        }
        return Score()
    }
}
