//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1).
//For nums[3]=2 there exist one smaller number than it (1).
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

package Arrays.Easy;

import java.util.Arrays;

public class SmallerThanCurrentNumber_LC1365 {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int n = nums.length, count;
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            count = 0;
            int temp = nums[i];
            for (int num : nums) {
                if (num < temp)
                    count++;
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
