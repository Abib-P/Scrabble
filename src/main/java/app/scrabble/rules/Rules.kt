package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word

class Rules(private val rules: List<Rule>) : Rule {
    override fun calculateScore(word: Word): Score = rules.map { it.calculateScore(word) }.reduce { score1, score2 -> score1 + score2 }
}
