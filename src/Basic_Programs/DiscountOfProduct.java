//Calculate Discount Of Product

package Basic_Programs;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price of the product - ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter the discounted percentage - ");
        double discount = sc.nextDouble();
        double discountAmount = (discount/100) * originalPrice ;
        System.out.println("Discount amount is "+ (discount/100) * originalPrice );
        System.out.println("The Price of the product after discount is Rs."+ (originalPrice - discountAmount));
    }
}
