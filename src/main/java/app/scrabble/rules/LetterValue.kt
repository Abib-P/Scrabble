package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

class LetterValue : Rule {

    override fun calculateScore(word: Word): Score = Score(points = word.value.toList().sumOf { it.score() })

    private fun Char.score(): Int = when (uppercaseChar()) {
        'A', 'E', 'I', 'L', 'N', 'O', 'R', 'S', 'T', 'U' -> 1
        'D', 'G' -> 2
        'B', 'C', 'M', 'P' -> 3
        'F', 'H', 'V', 'W', 'Y' -> 4
        'K' -> 5
        'J', 'X' -> 8
        'Q', 'Z' -> 10
        else -> 0
    }
}
