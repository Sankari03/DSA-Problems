//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

package Arrays.Easy;

import java.util.Arrays;

public class GreaterNoOfCandies_LC1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean [] ans = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int can = candies[i] + extraCandies;
            //boolean flag = true;
            for (int candy : candies) {
                if (can < candy) {
                    ans[i] = false;
                    break;
                }else{
                    ans[i] = true;
                }
            }
            //ans[i] = flag;
        }
        System.out.println(Arrays.toString(ans));
    }
}

//LC
//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//       List<Boolean> ans = new ArrayList<>();
//            for (int i = 0; i < candies.length; i++) {
//            ans.add(true);
//            int can = candies[i] + extraCandies;
//            for (int candy : candies) {
//                if (can < candy) {
//                    ans.set(i, false);
//                    break;
//                }
//            }
//        }return ans;
//    }
//}
