package app.scrabble.rules

import app.scrabble.word.Score
import app.scrabble.word.Word
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniqueLetterTest {
    private val uniqueLetter: UniqueLetter = UniqueLetter()

    @Test
    fun `should apply a x2 bonus when all letter are used once`() {
        val word = Word("Paul")

        val score = uniqueLetter.calculateScore(word)

        val expectedScore = Score(multiplicator = 2)
        assertEquals(expectedScore, score)
    }

    @Test
    fun `should not apply a x2 bonus when all letter are used more than once`() {
        val word = Word("Paola")

        val score = uniqueLetter.calculateScore(word)

        val expectedScore = Score(multiplicator = 1)
        assertEquals(expectedScore, score)
    }
}
