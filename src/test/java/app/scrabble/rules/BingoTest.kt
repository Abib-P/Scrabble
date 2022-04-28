package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BingoTest {
    private val bingo: Bingo = Bingo()

    @Test
    fun `should apply a x2 bonus when all letter are used once`() {
        val word = Word("Paul")

        val score = bingo.calculateScore(word)

        val expectedScore = Score(bonus = 0)
        assertEquals(expectedScore, score)
    }

    @Test
    fun `should not apply a x2 bonus when all letter are used more than once`() {
        val word = Word("Paulabi")

        val score = bingo.calculateScore(word)

        val expectedScore = Score(bonus = 50)
        assertEquals(expectedScore, score)
    }
}
