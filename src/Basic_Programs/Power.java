//Power In Java

package Basic_Programs;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.print("Enter the base value - ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.print("Enter the power value - ");
        int pow = sc.nextInt();
        int value = 1;
        if (pow == 0){
            System.out.println("The value is 1");
        }else{
            for (int i = 1; i <= pow ; i++) {
                value *= base;
            }
            System.out.println("The value is "+value);
        }
    }
}
