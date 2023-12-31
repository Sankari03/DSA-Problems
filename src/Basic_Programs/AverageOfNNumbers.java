//Calculate Average Of N Numbers

package Basic_Programs;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        System.out.print("How many numbers do you want to enter - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number "+ (i+1) + " - " );
            sum += sc.nextInt();
        }
        System.out.println("The average of the entered " + n + " numbers is "+sum/n);
    }
}
