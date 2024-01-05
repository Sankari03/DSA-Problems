//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.

package Arrays.Easy;

public class EvenNumberOfDigits_LC1295 {
    public static void main(String[] args) {
        int [] arr = {437,315,322,431,686,264,442};
        int ans = evenDigits(arr);
        System.out.println(ans);
    }
    public static int evenDigits(int [] nums){
        int  even = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
           while(nums[i] > 0){
               nums[i]= nums[i]/10;
               count++;
           }
           if (count%2 == 0){
               even++;
           }
        }
        return even;
    }
}
