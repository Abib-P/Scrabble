package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

interface Rules {
    fun calculateScore(word: Word): Score
}
