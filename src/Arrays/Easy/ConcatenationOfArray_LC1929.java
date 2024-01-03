//https://leetcode.com/problems/concatenation-of-array/description/

package Arrays.Easy;

import java.util.Arrays;

public class ConcatenationOfArray_LC1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

//LC
//class Solution {
//    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int [] ans = new int[2*n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i];
//            ans[i+n] = nums[i];
//        }return  ans;
//    }
//}