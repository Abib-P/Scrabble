package app.scrabble.rules

import app.scrabble.word.Word

class UniqueLetter : Rules {
    override fun applyRule(word: Word) {
        if (word.value.uppercase().toList().distinct().size == word.value.length) {
            word.multiplicator *= 2
        }
    }
}
