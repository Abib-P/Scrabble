package app.scrabble.word

data class Score(private val points: Int = 0, private val multiplicator: Int = 1, private val bonus: Int = 0) {
    init {
        require(0 <= points) { "Points must be positive or 0" }
        require(1 <= multiplicator) { "multiplicator must at least be 1" }
        require(0 <= bonus) { "Bonus must be positive or 0" }
    }

    fun compute(): Int {
        return (points * multiplicator) + bonus
    }

    operator fun plus(incrementScore: Score): Score {
        return Score(
                points = incrementScore.points + points,
                multiplicator = incrementScore.multiplicator * multiplicator,
                bonus = incrementScore.bonus + bonus
        )
    }
}
