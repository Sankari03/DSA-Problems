//Take integer inputs till the user enters 0 and print the largest number from
//all.

package Basic_Programs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, max = Integer.MIN_VALUE;
        do {
            System.out.println("Enter number one by one to find the largest number or enter 0 to exit");
            number = sc.nextInt();

            if (number > max && number != 0){
                max = number;
            }
        }while(number != 0);
        System.out.println("The largest number among the entered numbers is "+max);
    }
}
