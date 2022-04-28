package app.scrabble.rules

import app.scrabble.word.Word
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BingoTest {
    private val bingo: Bingo = Bingo()

    @Test
    fun `should apply a x2 bonus when all letter are used once`() {
        val word = Word("Paul")
        word.points = 0

        bingo.applyRule(word)

        assertEquals(0, word.getScore())
    }

    @Test
    fun `should not apply a x2 bonus when all letter are used more than once`() {
        val word = Word("Paulabi")

        bingo.applyRule(word)

        assertEquals(50, word.getScore())
    }
}
