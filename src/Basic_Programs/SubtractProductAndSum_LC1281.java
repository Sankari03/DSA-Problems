//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

package Basic_Programs;

import java.util.Scanner;

public class SubtractProductAndSum_Leetcode_1281 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int rem,sum = 0;
        int product = 1;

        while(number !=0 ){
            rem = number % 10;
            sum += rem;
            product *= rem;
            number/=10;
        }

        System.out.println("The difference between the product of the digits in the number" +
                "and the sum of the digits in the number is "+ (product-sum));
    }

    //Leetcode:

//    public int subtractProductAndSum(int n) {
//        int rem,sum = 0;
//        int product = 1;
//
//        while(n !=0 ){
//            rem = n % 10;
//            sum += rem;
//            product *= rem;
//            n/=10;
//        }
//        return product-sum;
//
//    }
}
