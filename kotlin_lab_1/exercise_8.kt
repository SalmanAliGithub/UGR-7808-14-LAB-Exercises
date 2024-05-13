fun main() {
    val passwordLength = 8 // Length of the password
    val password = generateRandomPassword(passwordLength)
    println("Generated Password: $password")
}

fun generateRandomPassword(length: Int): String {
    val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9');
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}
