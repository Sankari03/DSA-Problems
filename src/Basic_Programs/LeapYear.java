//Check Leap Year Or Not

package Basic_Programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a year to check if it is a leap year or not - ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year >= 1 && year <= 9999){
//            if (year % 4 == 0){
//                if (year % 100 == 0){
//                    if (year % 400 == 0){
//                        System.out.println("It is a leap year");
//                    }else{
//                        System.out.println("It is not a leap year");
//                    }
//                }else {
//                    System.out.println("It is a leap year");
//                }
//            }else {
//                System.out.println("It is not a leap year");
//            }
            if ((year % 4 == 0 & year % 100 != 0) || (year % 400 == 0)){
                System.out.println("It is a leap year");
            }else{
                System.out.println("It is not a leap year");
            }
        }else {
            System.out.println("Enter proper year");
        }
    }
}
