//[Write a program to print the sum of two numbers entered by user by defining your
// own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

//[Define a method that returns the product of two numbers entered by user.]
// (https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)

package Functions;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers - ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sum(num1, num2);
        product(num1, num2);
    }

    static void sum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("The sum of the two numbers is "+sum);
    }
    static void product(double num1, double num2) {
        double product = num1 * num2;
        System.out.println("The product of the two numbers is "+product);
    }
}
