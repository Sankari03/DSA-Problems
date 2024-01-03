//https://leetcode.com/problems/running-sum-of-1d-array/description/

package Arrays.Easy;

import java.util.Arrays;

public class RunningSumOf1DArray_LC1480 {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1};
        int [] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}

//LC
//class Solution {
//    public int[] runningSum(int[] nums) {
//        int n = nums.length;
//        int [] ans = new int[n];
//        if(nums.length >= 1 && nums.length <= 1000){
//        int sum =0;
//        for (int i = 0; i < n; i++) {
//            sum += nums[i];
//            ans[i] = sum;
//        }
//        }return  ans;
//    }
//}
