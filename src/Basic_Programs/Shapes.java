/*
1. Area Of Circle Java Program          2. Area Of Triangle
3. Area Of Rectangle Program            4. Area Of Isosceles Triangle
5. Area Of Parallelogram                6. Area Of Rhombus
7. Area Of Equilateral Triangle         8. Perimeter Of Circle
9. Perimeter Of Equilateral Triangle    10. Perimeter Of Parallelogram
11. Perimeter Of Rectangle              12. Perimeter Of Square
13. Perimeter Of Rhombus                14. Volume Of Cone Java Program
15. Volume Of Prism                     16. Volume Of Cylinder
17. Volume Of Sphere                    18. Volume Of Pyramid
19. Curved Surface Area Of Cylinder     20. Total Surface Area Of Cube
*/

package Basic_Programs;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("""
                    1. Area Of Circle Java Program\t\t\t\t\t2. Area Of Triangle
                    3. Area Of Rectangle Program \t\t\t\t\t4. Area Of Isosceles Triangle\s
                    5. Area Of Parallelogram\t\t\t\t\t\t6. Area Of Rhombus
                    7. Area Of Equilateral Triangle\t\t\t\t\t8. Perimeter Of Circle
                    9. Perimeter Of Equilateral Triangle\t\t\t10. Perimeter Of Parallelogram
                    11. Perimeter Of Rectangle\t\t\t\t\t\t12. Perimeter Of Square
                    13. Perimeter Of Rhombus\t\t\t\t\t\t14. Volume Of Cone Java Program
                    15. Volume Of Prism\t\t\t\t\t\t\t\t16. Volume Of Cylinder
                    17. Volume Of Sphere\t\t\t\t\t\t\t18. Volume Of Pyramid
                    19. Curved Surface Area Of Cylinder\t\t\t\t20. Total Surface Area Of Cube""");

            System.out.println("Enter any number between 1 - 20 to continue or press 0 to exit");
            n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println("Area Of Circle\nEnter the radius");
                    float radius = sc.nextFloat();
                    System.out.println("The Area Of the Circle is " + radius * radius);
                }
                case 2 -> {
                    System.out.println("Area Of Triangle\nEnter the base and height ");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Area Of the Triangle is "+ 0.5 * base * height);
                }
                case 3 -> {
                    System.out.println("Area Of Rectangle\nEnter the length and breadth ");
                    float length = sc.nextFloat();
                    float breadth = sc.nextFloat();
                    System.out.println("The Area Of the Rectangle is "+ length * breadth);
                }
                case 4 -> {
                    System.out.println("Area Of Isosceles Triangle\nEnter the base and height ");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Area Of the Isosceles Triangle is "+ 0.5 * base * height);
                }
                case 5 -> {
                    System.out.println("Area Of Parallelogram\nEnter the base and height ");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Area Of the Parallelogram is "+ base * height);
                }
                case 6 -> {
                    System.out.println("Area Of Rhombus\nEnter the diagonalOne and diagonalTwo ");
                    float diagonal1 = sc.nextFloat();
                    float diagonal2 = sc.nextFloat();
                    System.out.println("The Area Of the Isosceles Triangle is "+ 0.5 * diagonal1 * diagonal2);
                }
                case 7 -> {
                    System.out.println("Area Of Equilateral Triangle\nEnter the side ");
                    float side = sc.nextFloat();
                    System.out.println("The Area Of the Equilateral Triangle is "+ (Math.sqrt(3)/4) * side * side );
                }
                case 8 -> {
                    System.out.println("Perimeter Of Circle\nEnter the radius");
                    float radius = sc.nextFloat();
                    System.out.println("The Perimeter Of the Circle is " + 2 * 3.14 * radius);
                }
                case 9 -> {
                    System.out.println("Perimeter Of Equilateral Triangle\nEnter the side ");
                    float side = sc.nextFloat();
                    System.out.println("The Perimeter Of the Equilateral Triangle is "+ 3 * side);
                }
                case 10 -> {
                    System.out.println("Perimeter Of Parallelogram\nEnter the base and side");
                    float base = sc.nextFloat();
                    float side = sc.nextFloat();
                    System.out.println("The Perimeter Of the Parallelogram is "+ 2 * (base + side));
                }
                case 11 -> {
                    System.out.println("Perimeter Of Rectangle\nEnter the length and breadth ");
                    float length = sc.nextFloat();
                    float breadth = sc.nextFloat();
                    System.out.println("The Perimeter Of the Rectangle is "+ 2 * (length + breadth));
                }
                case 12-> {
                    System.out.println("Perimeter Of Square\nEnter the side ");
                    float side = sc.nextFloat();
                    System.out.println("The Perimeter Of the Square is "+ 4 * side);
                }
                case 13-> {
                    System.out.println("Perimeter Of Rhombus\nEnter the side ");
                    float side = sc.nextFloat();
                    System.out.println("The Perimeter Of the Rhombus is "+ 4 * side);
                }
                case 14-> {
                    System.out.println("Volume of Cone\nEnter the radius and height ");
                    float radius = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Volume of the Cone is "+ 1/3 * (3.14 * radius * radius * height));
                }
                case 15-> {
                    System.out.println("Volume of Prism\nEnter the base and height ");
                    float base = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Volume of the Prism is "+ (base * height));
                }
                case 16-> {
                    System.out.println("Volume of Cylinder\nEnter the radius and height ");
                    float radius = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Volume of the Cylinder is "+ (3.14 * radius * radius * height));
                }
                case 17-> {
                    System.out.println("Volume of Sphere\nEnter the radius ");
                    float radius = sc.nextFloat();
                    System.out.println("The Volume of the Sphere is "+ 4/3 * (3.14 * radius * radius * radius));
                }
                case 18-> {
                    System.out.println("Volume of Pyramid\nEnter the Base Length, Base Width and Height ");
                    float baseLength = sc.nextFloat();
                    float baseWidth = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The Volume of the Pyramid is "+ 1/3 * baseLength * baseWidth * height);
                }
                case 19-> {
                    System.out.println("CSA of Cylinder\nEnter the radius and height ");
                    float radius = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The CSA of the Cylinder is "+ (2 * 3.14  * radius * height));
                }
                case 20-> {
                    System.out.println("TSA of Cube\nEnter the radius and height ");
                    float radius = sc.nextFloat();
                    float height = sc.nextFloat();
                    System.out.println("The CSA of the Cylinder is "+ (2 * 3.14  * radius * height));
                }
                default -> System.out.println("Enter valid number from 1 to 20 to continue or enter 0 to exit");
            }
        }while(n != 0);
    }
}
