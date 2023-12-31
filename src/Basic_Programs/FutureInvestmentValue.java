//Future Investment Value
// FV=I×(1+(R×T))

package Basic_Programs;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        System.out.println("Enter the initial amount");
        Scanner sc = new Scanner(System.in);
        double initial = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double roi = sc.nextDouble()/100;
        System.out.println("Enter the time period");
        double timePeriod = sc.nextDouble();

        double futureValue = initial * (1 + (roi * timePeriod));
        System.out.println("Your future value is "+ futureValue);
    }
}
