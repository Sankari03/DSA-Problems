//Write a program to print the sum of negative numbers, sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

package Basic_Programs;

import java.util.Scanner;

public class SumOfDiffNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, negSum = 0, evenSum = 0, oddSum = 0;
        do {
            System.out.print("Enter a number");
            number = sc.nextInt();
            if (number < 0){
                negSum += number;
            } else{
                if (number % 2 == 0){
                    evenSum += number;
                }else {
                    oddSum += number;
                }
            }
        }while (number != 0);

        System.out.println("The sum of negative numbers is "+negSum);
        System.out.println("The sum of positive even numbers is "+evenSum);
        System.out.println("The sum of positive odd numbers is "+oddSum);
    }
}
