fun main() {
    println("Enter a string:")
    val input = readLine() ?: return
    
    if (input.isEmpty()) {
        println("Input string is empty.")
        return
    }
    
    var minChar = input[0]
    var maxChar = input[0]
    
    for (char in input) {
        if (char < minChar) {
            minChar = char
        }
        if (char > maxChar) {
            maxChar = char
        }
    }
    
    println("Minimum character: $minChar (ASCII value: ${minChar.toInt()})")
    println("Maximum character: $maxChar (ASCII value: ${maxChar.toInt()})")
}
