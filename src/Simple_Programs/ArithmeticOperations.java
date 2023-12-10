//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

package Simple_Programs;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter an operator to perform the operation");
            char operator = sc.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Enter two numbers");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();

                switch (operator) {
                    case '+' -> System.out.println("The answer is " + (number1 + number2));
                    case '-' -> System.out.println("The answer is " + (number1 - number2));
                    case '*' -> System.out.println("The answer is " + (number1 * number2));
                    case '/' -> {
                        if (number2 != 0) {
                            System.out.println("The answer is " + (number1 / number2));
                        } else {
                            System.out.println("Denominator must not be zero");
                        }
                    }
                    case '%' -> System.out.println("The answer is " + (number1 % number2));
                }
            } else {
                System.out.println("Enter valid operator");
                break;
            }
        }
    }
}
