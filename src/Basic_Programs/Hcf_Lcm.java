//HCF Of Two Numbers Program
//LCM Of Two Numbers

package Basic_Programs;

import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to find the HCF and LCM - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b ; i++) {
            if (a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        int lcm = (a*b)/hcf;

        System.out.println("The HCF of the 2 numbers "+a+" "+b+" is "+hcf);
        System.out.println("The LCM of the 2 numbers "+a+" "+b+" is "+lcm);

    }
}
