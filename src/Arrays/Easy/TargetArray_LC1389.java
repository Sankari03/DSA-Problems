//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]

package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray_LC1389 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] res = createTargetArray(nums,index);
        System.out.println(Arrays.toString(res));
    }
    public static int [] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int [] target= new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}

//LC
//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int n = nums.length;
//        int [] target= new int[n];
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(index[i], nums[i]);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            target[i] = list.get(i);
//        }
//        return target;
//    }
//}
