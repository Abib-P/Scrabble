package app.scrabble.rules

import app.scrabble.word.Word

class Bingo : Rules {
    override fun applyRule(word: Word) {
        if (word.value.length == 7)
            word.bonus += 50
    }
}
