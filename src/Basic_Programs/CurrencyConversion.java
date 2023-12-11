//Input currency in rupees and output in USD.

package Basic_Programs;

import java.util.Scanner;

public class CurrencyConversion{
    public static void main(String[] args) {
        System.out.println("Enter rupees to convert into USDs : ");
        Scanner sc = new Scanner(System.in);

        double rupees = sc.nextFloat();
        double usd = rupees / 83.370153;

        System.out.println(rupees+" rupees is " + usd + " USDs");
    }
}
