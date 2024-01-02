//[Write a function to check if a given triplet is a Pythagorean triplet or not.]
// (https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/)
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the
// square of the third number).

package Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to find if it is pythagorean triplet - ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        boolean ans = isPythagoreanTriplet(a,b,c);
        if (ans) {
            System.out.println("It is a pythagorean triplet.!");
        }
        else {
            System.out.println("Not a pythagorean triplet");
        }
    }
    static boolean isPythagoreanTriplet(int a, int b, int c){
        int x = a * a;
        int y = b * b;
        int z = c * c;
        return x == y + z || y == x + z || z == x + y;
    }
}
