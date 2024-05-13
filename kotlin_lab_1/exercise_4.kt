fun main() {
    var orgPrice: Double = 40.0;
    var discount:Double = 0.4;

    var finalPrice: Double;

    if (discount >= 0.5) {
        print("Discount too high!");
    } else {
        finalPrice = orgPrice * discount;
        print("Discount: $discount orginalPrice: $orgPrice final: $finalPrice");
    }
}