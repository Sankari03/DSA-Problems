//To find out whether the given String is Palindrome or not.

package Basic_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a palindrome or not");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim().toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start <= end){
            if(input.charAt(start) != input.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome){
            System.out.println("The given string is a palindrome");
        }else{
            System.out.println("The given string is not a palindrome");
        }

        //Another method
//        String reverse = ""; (or) StringBuilder reverse = new StringBuilder();
//        for (int i = input.length()-1; i >= 0 ; i--) {
//            reverse += input.charAt(i); (or) reverse.append(input.charAt(i));
//        }
//
//        if (input.equals(reverse.toString())){
//            System.out.println("The string is palindrome");
//        }else{
//            System.out.println("The string is not a palindrome");
//        }

    }
}
