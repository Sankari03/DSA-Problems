//https://leetcode.com/problems/find-the-highest-altitude/description/

//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

package Arrays.Easy;

import java.util.Arrays;

public class HighestAltitude_LC1732 {
    public static void main(String[] args) {
        int [] gain = {-5, 1, 5, 0, -7};
        int max = 0, sum = 0;
        int [] altitude = new int[gain.length+1];
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            altitude[i+1] = sum;
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(Arrays.toString(altitude));
        System.out.println(max);
    }
}

//LC
//class Solution {
//    public int largestAltitude(int[] gain) {
//        int sum = 0, max = 0;
//      for (int i = 0; i < gain.length; i++) {
//            sum += gain[i];
//            if (sum > max){
//                max = sum;
//            }
//        }
//        return max;
//    }
//}