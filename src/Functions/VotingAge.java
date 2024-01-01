//3. [A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.]
// (https://www.efaculty.in/java-programs/voting-age-program-in-java/)

package Functions;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age - ");
        int age = sc.nextInt();
        boolean eligibility = isEligible(age);
        if (eligibility){
            System.out.println("You are eligible to vote.!");
        }else {
            System.out.println("You are not eligible to vote.!");
        }
    }
    static boolean isEligible(int age){
        return age >= 18;
    }
}
