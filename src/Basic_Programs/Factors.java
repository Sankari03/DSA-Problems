//Input a number and print all the factors of that number (use loops).

package Basic_Programs;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("Enter a number to find its factors: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter only positive numbers");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
