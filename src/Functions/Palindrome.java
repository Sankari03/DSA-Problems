//[Write a function to find if a number is a palindrome or not. Take number as parameter.]
// (https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)

package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome - ");
        int number = sc.nextInt();
        isPalindrome(number);
    }
    static void isPalindrome(int number){
        int rev = 0, rem;
        int temp = number;

        while (temp != 0){
            rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (number - rev == 0){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }
    }
}
