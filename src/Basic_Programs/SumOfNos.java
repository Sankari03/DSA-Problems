//Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)

package Basic_Programs;

import java.util.Scanner;

public class SumOfNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(true) {
            System.out.println("Enter number one by one to find their sum, or enter 0 to stop");
            int number = sc.nextInt();
            if (number < 0){
                System.out.println("Enter a valid integer");
            }else if (number == 0){
                break;
            }else {
                sum += number;
            }
        }
        System.out.println("The sum of entered numbers is " + sum);
    }
}
