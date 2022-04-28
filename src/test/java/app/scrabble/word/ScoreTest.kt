package app.scrabble.word

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

internal class ScoreTest {
    @Test
    fun `should throw exception when trying to create score with negative points`() {
        assertThrows<IllegalArgumentException> {
            Score(points = -1)
        }
    }

    @Test
    fun `should throw exception when trying to create score with negative bonus`() {
        assertThrows<IllegalArgumentException> {
            Score(bonus = -1)
        }
    }

    @TestFactory
    fun `should throw exception when trying to create score with null or negative multiplicator`() = listOf(
            0,
            -1,
            -25
    )
            .map { input ->
                DynamicTest.dynamicTest("when I create a score with a multiplicator of $input then I get an exception") {
                    assertThrows<IllegalArgumentException> {
                        Score(multiplicator = input)
                    }
                }
            }

    @ParameterizedTest(name = "{index} => points={0}, multiplicator={1}, bonus={2}, expected={3}")
    @CsvSource(
        "1, 1, 2, 3",
        "2, 3, 5, 11"
    )
    fun `should calculate correctly the score to score`(points: Int, multiplicator: Int, bonus: Int, expected: Int) {
        val score = Score(
                points = points,
                bonus = bonus,
                multiplicator = multiplicator
        )
        assertEquals(expected, score.compute())
    }

}
