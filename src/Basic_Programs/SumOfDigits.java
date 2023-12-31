// Sum Of A Digits Of Number

package Basic_Programs;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number - ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rem, sum = 0;
        while (number != 0){
            rem = number%10;
            sum += rem;
            number = number /10;
        }
        System.out.println("The sum of digits of the given number is "+sum);
    }
}
