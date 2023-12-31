//Perfect Number In Java

package Basic_Programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is a perfect number or not - ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum == number)
            System.out.println("It is a perfect number");
        else System.out.println("It is not a perfect number");
    }
}
