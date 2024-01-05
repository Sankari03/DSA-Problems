//https://leetcode.com/problems/transpose-matrix/description/
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]

package Arrays.Easy;

public class TransposeOfMatrix_LC867 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6}};
        int [][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

//LC
//class Solution {
//    public int[][] transpose(int[][] matrix) {
//        int [][] ans = new int[matrix[0].length][matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                ans[j][i] = matrix[i][j];
//            }
//        }
//        return ans;
//    }
//}
