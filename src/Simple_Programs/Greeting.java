//Take name as input and print a greeting message for that particular name.

package Simple_Programs;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Have a nice day "+ name + " :)");
    }
}
