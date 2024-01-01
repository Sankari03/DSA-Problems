package Functions;

import java.util.Scanner;

public class CircumArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius = sc.nextFloat();
        areaOfCircle(radius);
        circumferenceOfCircle(radius);
    }
    static void areaOfCircle(float radius){
        System.out.println("The Area Of the Circle is " + 3.14 * radius * radius);
    }
    static void circumferenceOfCircle(float radius) {
        System.out.println("The Perimeter Of the Circle is " + 2 * 3.14 * radius);
    }
}
