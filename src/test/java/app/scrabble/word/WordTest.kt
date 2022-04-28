package app.scrabble.word

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class WordTest {
    @Test
    fun `should create word with Paul value`() {
        val word = Word("Paul")

        val expected = "Paul"
        assertEquals(expected, word.value)
    }

    @Test
    fun `should throw exception when trying to create blank word`() {
        assertThrows<IllegalArgumentException> {
            Word("   ")
        }
    }
}
