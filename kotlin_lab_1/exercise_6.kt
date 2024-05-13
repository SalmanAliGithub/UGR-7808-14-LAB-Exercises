
fun findMax(numbers: List<Int>): Int? {
    if (numbers.isEmpty()) return null
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}


fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun calculateAverage(numbers: List<Double>): Double? {
    if (numbers.isEmpty()) return null
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    return sum / numbers.size
}

fun main() {
    val numbers1 = listOf(3, 7, 2, 8, 5)
    println("Maximum value in the list: ${findMax(numbers1)}")
    
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Even numbers in the list: ${filterEvenNumbers(numbers2)}")
    
    val numbers3 = listOf(2.5, 3.7, 1.2, 4.8, 2.1)
    println("Average of the list: ${calculateAverage(numbers3)}")
}
