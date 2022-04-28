package app.scrabble.rules

import app.scrabble.word.Word
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniqueLetterTest {
    private val uniqueLetter: UniqueLetter = UniqueLetter()

    @Test
    fun `should apply a x2 bonus when all letter are used once`() {
        val word = Word("Paul")
        word.points = 10

        uniqueLetter.applyRule(word)

        assertEquals(2, word.multiplicator)
        assertEquals(20, word.getScore())
    }

    @Test
    fun `should not apply a x2 bonus when all letter are used more than once`() {
        val word = Word("Paola")
        word.points = 10

        uniqueLetter.applyRule(word)

        assertEquals(1, word.multiplicator)
        assertEquals(10, word.getScore())
    }
}
