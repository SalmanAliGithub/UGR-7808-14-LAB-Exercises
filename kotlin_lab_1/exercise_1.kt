fun main() {

    fun doOperations(num1: Double, num2: Double, operand: String) : String {
        val answer: String
        when (operand) {
            "+" -> answer = ("Result: ${num1 + num2}")
            "-" -> answer = ("Result: ${num1 - num2}")
            "*" -> answer = ("Result: ${num1 * num2}")
            "/" -> {
                if (num2 != 0.0) {
                    answer = ("Result: ${num1 / num2}")
                } else {
                    answer = ("Error: Division by zero")
                }
            }
            else -> answer = ("Invalid operation. Please choose from '+', '-', '*', '/'")
        }
        return answer
    }

    // Check:
    println(doOperations(5.0, 2.0, "+")) // Output: Result: 7.0
}
