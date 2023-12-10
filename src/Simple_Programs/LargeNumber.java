//Take 2 numbers as input and print the largest number.

package Simple_Programs;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result;

//        int result = (number1 >= number2) ? number1 : number2;

//        int result = Math.max(number1, number2);

        if (number1 > number2) {
            result = number1;
            System.out.println("The largest number is "+result);
        }
        else if(number1 == number2){
            System.out.println("Both numbers are equal");
        }else{
            result = number2;
            System.out.println("The largest number is "+result);
        }
    }
}
