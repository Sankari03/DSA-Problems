//Find Ncr & Npr

package Basic_Programs;

import java.util.Scanner;

public class NCR_NPR {
    public static void main(String[] args) {
        System.out.println("1. Permutation\n2. Combination");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int nFact = 1, rFact = 1, nrFact = 1, n, r;
        switch (choice) {
            case 1 -> {
                System.out.print("Enter the value of n - ");
                n = sc.nextInt();
                System.out.print("Enter the value of r - ");
                r = sc.nextInt();
                if (r == 1) {
                    System.out.println("The permutation value is " + n);
                } else {
                    for (int i = n; i >= 1; i--) {
                        nFact *= i;
                    }
                    for (int i = n - r; i >= 1; i--) {
                        nrFact *= i;
                    }
                    int permutation = nFact / nrFact;
                    System.out.println("The permutation value is " + permutation);
                }
            }
            case 2 -> {
                System.out.print("Enter the value of n - ");
                n = sc.nextInt();
                System.out.print("Enter the value of r - ");
                r = sc.nextInt();
                if (r == 1) {
                    System.out.println("The permutation value is " + n);
                    break;
                }
                if (n == r) {
                    System.out.println("The permutation value is 1");
                } else {
                    for (int i = n; i >= 1; i--) {
                        nFact *= i;
                    }
                    for (int i = n - r; i >= 1; i--) {
                        nrFact *= i;
                    }
                    for (int i = r; i >= 1; i--) {
                        rFact *= i;
                    }
                    int permutation = nFact / (rFact * nrFact);
                    System.out.println("The permutation value is " + permutation);
                }
            }
        }
    }
}
