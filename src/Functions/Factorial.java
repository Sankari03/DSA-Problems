//[Write a program to print the factorial of a number by defining a method named 'Factorial'.]
// (https://www.javatpoint.com/factorial-program-in-java)
//Factorial of any number n is represented by n! and is equal to 1 _ 2 _ 3 _ .... _ (n-1).
//E.g.-
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1

package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }
    static void factorial() {
        System.out.print("Enter a number to find its factorial :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = 1;
        if (number == 1 || number == 0) {
            System.out.println(number + " factorial is " + result);
        } else {
            for (int i = number; i >= 1; i--) {
                result *= i;
            }
            System.out.println(number + " factorial is " + result);
        }
    }
}
