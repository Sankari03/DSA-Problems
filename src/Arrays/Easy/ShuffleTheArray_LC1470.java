//https://leetcode.com/problems/shuffle-the-array/description/

package Arrays.Easy;

import java.util.Arrays;

public class ShuffleTheArray_LC1470 {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        int [] ans = new int[2*n];
        int temp = 0;
        for (int i = 0, j = i+n; i < n ; i++,j++) {
            ans[temp] = nums[i];
            ans[temp+1] = nums[j];
            temp+=2;
        }
        System.out.println(Arrays.toString(ans));
    }
}

//LC
//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int [] ans = new int[2*n];
//        int temp = 0;
//        for (int i = 0, j = n; i < n ; i++, j++) {
//            ans[temp] = nums[i];
//            ans[temp+1] = nums[j];
//            temp+=2;
//        }
//        return ans;
//    }
//}
