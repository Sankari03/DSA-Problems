//Calculate Batting Average

package Basic_Programs;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        System.out.print("Enter the runs scored - ");
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        System.out.print("Enter the number of times got out - ");
        int out = sc.nextInt();

        double battingAverage = (double) runs /out;
        System.out.println("The batting average is - "+battingAverage);
    }
}
