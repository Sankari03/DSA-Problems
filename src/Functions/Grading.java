//[Write a program that will ask the user to enter his/her marks (out of 100). 
// Define a method that will display grades according to the marks entered as below:]
// (https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
//Marks        Grade 
//91-100         AA 
//81-90          AB 
//71-80          BB 
//61-70          BC 
//51-60          CD 
//41-50          DD 
//<=40          Fail

package Functions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark to find your grade - ");
        int mark = sc.nextInt();
        findGrade(mark);
    }

    static void findGrade(int mark) {
        if (mark < 1 || mark > 100){
            System.out.println("Enter your marks correctly(Between 1 and 100).");
        } else if (mark <= 40) {
            System.out.println("Fail.!");
        }else if (mark <= 50){
            System.out.println("Grade - DD");
        } else if (mark <= 60) {
            System.out.println("Grade - CD");
        }else if (mark <= 70) {
            System.out.println("Grade - BC");
        }else if ( mark <= 80) {
            System.out.println("Grade - BB");
        }else if (mark <= 90) {
            System.out.println("Grade - AB");
        }else{
            System.out.println("Grade - AA");
        }
    }
}
