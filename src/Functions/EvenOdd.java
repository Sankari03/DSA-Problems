package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd - ");
        int n = sc.nextInt();
        OddOrEven1(n);
        OddOrEven2(21);
        OddOrEven3(12);
        OddOrEven4(39);
    }

    static void OddOrEven1(int n){
        if (n%2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
    static void OddOrEven2(int n){
        if ((n | 1) > n) System.out.println("The number is Even");
        else {
            System.out.println("The number is Odd");
        }
    }
    static void OddOrEven3(int n){
        if ((n & 1) == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
    static void OddOrEven4(int n){
        if ((n ^ 1) == n+1){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }

}
