//Find if a number is palindrome or not

package Basic_Programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is palindrome number or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0, rem;
        int temp = num;

        while (temp != 0){
            rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (num - rev == 0){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }
    }
}
