//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

package Basic_Programs;

public class EvenDays {
    public static void main(String[] args) {
        int augDays = 31;
        int evenDays = 0;
        for (int i = 1; i <= augDays ; i++) {
            if (i % 2 == 0){
                evenDays++;
            }
        }
        System.out.println("Number of days Kunal can go out with his friends is "+evenDays);
    }
}
