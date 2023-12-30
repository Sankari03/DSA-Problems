package Basic_Programs;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the number of units - ");
        Scanner sc = new Scanner(System.in);
        double units = sc.nextDouble();
        double amount = 0;
        if (units <= 500){
            if (units <= 100){
                amount = 0;
            } else if (units <= 200) {
                amount = (units-100) * 2.25;
            }else if (units <= 400) {
                amount = 100 * 2.25 + (units - 200) * 4.5;
            }else {
                amount = 100 * 2.25 + 200 * 4.5 + (units-400) * 6;
            }
        } else {
            if (units <= 600) {
                amount = 400 * 4.5 + 100 * 6 + (units - 500) * 8;
            }else if (units <= 800) {
                amount = 400 * 4.5 + 100 * 6 + 100 * 8 + (units - 600) * 9;
            }else if (units <= 1000) {
                amount = 400 * 4.5 + 100 * 6 + 100 * 8 + 200 * 9 + (units - 800) * 10;
            }else if (units > 1000) {
                amount = 400 * 4.5 + 100 * 6 + 100 * 8 + 200 * 9 + 200 * 10 + (units - 1000) * 11;
            }
        }

        System.out.println("Amount to be paid - "+amount);
    }
}
