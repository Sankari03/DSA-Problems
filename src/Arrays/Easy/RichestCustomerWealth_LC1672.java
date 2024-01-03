//https://leetcode.com/problems/richest-customer-wealth/description/
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.

package Arrays.Easy;

public class RichestCustomerWealth_LC1672 {
    public static void main(String[] args) {
        int [][] nums = {{1,5},{7,3},{3,5}};
        int max = 0, sum;
        for (int[] num : nums) {
            sum = 0;
            for (int i : num) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}

//LC
//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        int n = accounts.length;
//        int sum,max = 0;
//        for (int i = 0; i < n; i++) {
//          sum =0;
//            for (int j = 0; j < accounts[i].length ; j++) {
//                sum += accounts[i][j];
//            }if(max<sum)
//                max = sum;
//        }return  max;
//    }
//}
