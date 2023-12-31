//Reverse A String In Java

package Basic_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String reverse = "";

        for (int i = string.length()-1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        System.out.println("The reversed string is "+ reverse);
    }
}
