// Factorial Program In Java

package Basic_Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number to find its factorial :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = 1;

        for (int i = number; i >= 1 ; i--) {
            result *= i;
        }

        System.out.println( number + " factorial is "+ result);
    }
}
