package app.scrabble.rules

import app.scrabble.word.Word

interface Rules {
    fun applyRule(word: Word)
}
