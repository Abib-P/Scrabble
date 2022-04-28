package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

interface Rule {
    fun calculateScore(word: Word): Score
}
