//https://leetcode.com/problems/number-of-good-pairs/description/
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

package Arrays.Easy;

public class NoOfGoodPairs_LC1512 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j] == temp)
                    count++;
            }
        }
        System.out.println(count);
    }
}

//LC
//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int temp = nums[i];
//            for (int j = i+1; j < nums.length ; j++) {
//                if (nums[j] == temp)
//                    count++;
//            }
//        }
//        return count;
//    }
//}
