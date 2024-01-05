//https://leetcode.com/problems/matrix-diagonal-sum/description/
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.

package Arrays.Easy;

public class DiagonalSum_LC1572 {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || (i+j == mat.length-1)){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

//LC
//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum =0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (i == j || (i+j == mat.length-1)){
//                    sum += mat[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//}