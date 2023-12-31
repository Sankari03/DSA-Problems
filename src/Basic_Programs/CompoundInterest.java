// Compound Interest Java Program

package Basic_Programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter the interest");
        double interest = sc.nextDouble();
        System.out.println("Enter the number of years");
        double numberOfYears = sc.nextDouble();

        double compoundInterest = principal * Math.pow((1 + (interest/100)),numberOfYears);
        System.out.println("Compound Interest is Rs."+compoundInterest);
    }
}
