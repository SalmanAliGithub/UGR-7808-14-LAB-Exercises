fun main() {

    println("Enter grade: ");
    val grade = readLine()?.toDoubleOrNull() ?: return
    
   if (grade >= 90 && grade <= 100) {
    print("A");
   } else if (grade >= 80) {
    print("B");
   } else if (grade >= 70) {
    print("C");
   } else if (grade >= 60) {
    print("D");
   } else {
    print("F");
   }
    
}