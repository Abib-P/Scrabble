package app.scrabble.word

data class Word(val value: String) {
    var points = 0
    var multiplicator = 1
    var bonus = 0

    fun getScore(): Int {
        return (points * multiplicator) + bonus
    }
}
