package app.scrabble.word

data class Word(val value: String){
    init {
        require(value.isNotBlank()) { "The word must contain something" }
    }
}
