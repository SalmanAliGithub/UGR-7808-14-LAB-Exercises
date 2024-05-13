fun analyzeString(input: String): Triple<Int, Int, Int> {
    var wordCount = 0
    var uppercaseCount = 0
    var vowelCount = 0

    if (input.isNotEmpty()) {
        wordCount = input.split("\\s+".toRegex()).filter { it.isNotBlank() }.size

        for (char in input) {
            if (char.isUpperCase()) {
                uppercaseCount++
            }
            if (char.toLowerCase() in setOf('a', 'e', 'i', 'o', 'u')) {
                vowelCount++
            }
        }
    }

    return Triple(wordCount, uppercaseCount, vowelCount)
}

fun main() {
    val input = "Salman Ali."
    val (wordCount, uppercaseCount, vowelCount) = analyzeString(input)
    
    println("Number of words: $wordCount")
    println("Number of uppercase letters: $uppercaseCount")
    println("Number of vowels: $vowelCount")
}
