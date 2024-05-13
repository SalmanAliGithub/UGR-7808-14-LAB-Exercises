fun main() {

    println("Enter the number to be converted:");
    val valuee = readLine()?.toDoubleOrNull() ?: return
    println("Enter the unit:");
    val unit = readLine() ?: return
    
    fun KMtoMeter(valuee: Double): Double {
        return valuee * 1000;
    }
    
    val answer = KMtoMeter(valuee);
    
    print("$valuee $unit is equal to: $answer meters.");
}