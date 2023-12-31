//Java Program Vowel Or Consonant

package Basic_Programs;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a character to check if it is vowel or consonant - ");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        if ((letter >= 'a' && letter <= 'z') ||(letter >= 'A' && letter <= 'Z')){
            switch (letter){
                case 'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U' -> System.out.println("The given letter is a vowel");
                default -> System.out.println("The given letter is a consonant");
            }
        }else{
            System.out.println("Enter a valid letter");
        }
    }
}
