//Calculate Distance Between Two Points

package Basic_Programs;

import java.util.Scanner;

public class DistanceBetween {
    public static void main(String[] args) {
        System.out.println("Enter the first point:");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second point:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println("The distance between the 2 points is "+distance+" units");
    }
}
