fun applyUppercaseTransformation(strings: List<String>): List<String> {
    return strings.map { it.toUpperCase() }
}

fun filterNumbersGreaterThan(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}

fun calculateSum(numbers: List<Int>): Int {
    var summ: Int = 0;
    for (num in numbers) {
        summ = summ + num;
    }
    return summ;
}

fun main() {
    val strings = listOf("hello", "world", "kotlin")
    val uppercaseStrings = applyUppercaseTransformation(strings)
    println("Uppercase strings: $uppercaseStrings")

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filteredNumbers = filterNumbersGreaterThan(numbers, 5)
    println("Numbers greater than 5: $filteredNumbers")

    val sum = calculateSum(numbers)
    println("Sum of all numbers: $sum")
}
