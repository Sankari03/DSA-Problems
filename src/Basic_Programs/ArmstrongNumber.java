//To find Armstrong Number between two given number.

package Basic_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the range between which you want to find the armstrong number");
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        int rem, num;

        for (int i = start+1; i < end ; i++) {
            num = i;
            int temp = num;
            int sum = 0;
            while (num != 0){
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }

            if (sum == temp){
                System.out.print(temp + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no armstrong numbers in the given range");
        }
    }
}
