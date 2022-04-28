package app.scrabble.rules

import app.scrabble.word.Word
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class LetterValueTest {
    private val letterValue: LetterValue = LetterValue()

    @ParameterizedTest
    @CsvSource(
            "tEsT,4",
            "Javaz,24",
            "paUl,6"
    )
    fun `should calculate the value of words`(input: String, expected: Int) {
        val word = Word(input)

        letterValue.applyRule(word)

        assertEquals(expected, word.points)
    }

    @TestFactory
    fun `should calculate the value of words2`() = listOf(
            "tEsT" to 4,
            "Javaz" to 24,
            "paUl" to 6
    )
            .map { (input, expected) ->
                DynamicTest.dynamicTest("when I calculate the value of $input then I get $expected") {
                    val word = Word(input)

                    letterValue.applyRule(word)

                    assertEquals(expected, word.points)
                }
            }
}
