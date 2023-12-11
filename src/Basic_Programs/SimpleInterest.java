//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

package Basic_Programs;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount - ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Number of Years - ");
        double noOfYears = sc.nextDouble();
        System.out.print("Enter the Rate of Interest - ");
        double rateOfInterest = sc.nextDouble();

        double simpleInterest = (principal * noOfYears * rateOfInterest) / 100;

        System.out.println("Simple Interest is - "+simpleInterest);
    }
}
