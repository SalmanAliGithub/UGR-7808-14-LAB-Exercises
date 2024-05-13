class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$amount deposited successfully.")
        } else {
            println("Invalid deposit amount. Please enter a positive value.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount
                println("$amount withdrawn successfully.")
            } else {
                println("Insufficient funds. Cannot withdraw $amount. Current balance: $balance")
            }
        } else {
            println("Invalid withdrawal amount. Please enter a positive value.")
        }
    }

    fun printBalance() {
        println("Account Balance: $balance")
    }
}

fun main() {
    val account = BankAccount("123456789", 1000.0)

    
    account.deposit(500.0)
    account.printBalance()

    
    account.withdraw(200.0)
    account.printBalance()

    
    account.withdraw(2000.0)
}
