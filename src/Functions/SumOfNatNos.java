//14. [Write a function that returns the sum of first n natural numbers.]
// (https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)

package Functions;

import java.util.Scanner;

public class SumOfNatNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number till which you need to find the sum - ");
        int number = sc.nextInt();
        int ans = sumOfNatNos(number);
        System.out.println("The sum of natural numbers till "+number+" is "+ans);
    }
    static int sumOfNatNos(int n){
        return n*(n+1)/2;
    }
}
