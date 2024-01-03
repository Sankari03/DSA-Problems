//https://leetcode.com/problems/build-array-from-permutation/description/

package Arrays.Easy;

import java.util.Arrays;

public class BuildArrayFromPermutation_LC1920 {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int [] ans = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}

//LC
//class Solution {
//    public int[] buildArray(int[] nums) {
//        int [] ans = new int [nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }
//}