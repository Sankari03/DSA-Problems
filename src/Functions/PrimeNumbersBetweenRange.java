//[Write a function that returns all prime numbers between two given numbers.]
// (https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)

package Functions;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound - ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound - ");
        int upper = sc.nextInt();
        if (lower > upper){
            System.out.println("The upper bound must be greater than the lower bound.");
        }else{
            prime(lower, upper);
        }
    }
    static void prime(int a, int b){
        for (int i = a; i <= b ; i++) {
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
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
