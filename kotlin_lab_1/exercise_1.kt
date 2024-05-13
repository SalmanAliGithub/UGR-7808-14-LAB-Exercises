fun main() {
    println("Enter the first number:")
    val num1 = readLine()?.toDoubleOrNull() ?: return
    println("Enter the second number:")
    val num2 = readLine()?.toDoubleOrNull() ?: return
    println("Enter the operation (+, -, *, /):")
    val operation = readLine() ?: return

 
    val result = doOperations(num1, num2, operation)

    println(result)
}

fun doOperations(num1: Double, num2: Double, operand: String): String {
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
