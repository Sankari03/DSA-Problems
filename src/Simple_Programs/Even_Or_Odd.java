//Write a program to print whether a number is even or odd, also take input from the user.

package Simple_Programs;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is Even or Odd");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number%2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
}
