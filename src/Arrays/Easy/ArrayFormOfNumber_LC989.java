//https://leetcode.com/problems/add-to-array-form-of-integer/description/
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234

package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfNumber_LC989 {
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(nums,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        for(int i = n-1; i >= 0; i--){
            int number = num[i]+ k%10 +carry;
            ans.add(number%10);
            carry = number/10;
            k/=10;
        }
        k = k+ carry;
        while(k > 0){
            ans.add(k%10);
            k/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}


//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int n = num.length;
//        int carry = 0;
//        for(int i = n-1; i >= 0; i--){
//            int number = num[i]+ k%10 +carry;
//            ans.add(number%10);
//            carry = number/10;
//            k/=10;
//        }
//        k = k+ carry;
//        while(k > 0){
//            ans.add(k%10);
//            k/=10;
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//}