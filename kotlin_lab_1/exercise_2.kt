fun main() {
    val valuee: Double = 10.0;
    val unit: String = "KM";
    
    fun KMtoMeter(valuee: Double): Double {
        return valuee * 1000;
    }
    
    val answer = KMtoMeter(valuee);
    
    print("$valuee $unit is equal to: $answer meters.");
}