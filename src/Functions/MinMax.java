//[Define two methods to print the maximum and the minimum number respectively among
// three numbers entered by the user.]
// (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

package Functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers to find the greatest and smallest among the three - ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maxVal = max(num1, num2, num3);
        int minVal = min(num1, num2, num3);
        System.out.println("The maximum among three is - "+ maxVal);
        System.out.println("The minimum among three is - "+minVal);
    }
    static int max(int num1, int num2, int num3){
        int max = num1;
        if (max < num2){
            max = num2;
        }
        if (max < num3){
            max = num3;
        }
        return max;
    }
    static int min(int num1, int num2, int num3){
        int min = num1;
        if (min > num2){
            min = num2;
        }
        if (min > num3){
            min = num3;
        }
        return min;
    }
}
