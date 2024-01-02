//Define a method to find out if a number is prime or not.]
// (https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)

package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime - ");
        int number = sc.nextInt();
        boolean ans = isPrime(number);
        if (ans){
            System.out.println("Prime Number.!");
        }else {
            System.out.println("Not a Prime Number.!");
        }
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
