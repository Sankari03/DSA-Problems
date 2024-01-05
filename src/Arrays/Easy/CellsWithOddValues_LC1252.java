//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

package Arrays.Easy;

public class CellsWithOddValues_LC1252 {
    public static void main(String[] args) {
        int m = 2,n = 3, oddCount = 0;
        int [][] arr = new int[m][n];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int [][] indices = {{0,1},{1,1}};
        for (int[] a : indices) {
            int row = a[0];
            //System.out.println(row);
            int col = a[1];
            System.out.println(col);
            for (int i = 0; i < n; i++) {
                arr[row][i]++;
            }
            for (int i = 0; i < m; i++) {
                arr[i][col]++;
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt % 2 != 0){
                    oddCount++;
                }
            }
            System.out.println();
        }
        System.out.println(oddCount);
    }
}

//LC
//class Solution {
//    public int oddCells(int m, int n, int[][] indices) {
//        int[][] arr = new int[m][n];
//        int oddCount = 0;
//        for (int[] a : indices) {
//            int row = a[0];
//            // System.out.println(row);
//            int col = a[1];
//            // System.out.println(col);
//            for (int i = 0; i < n; i++) {
//                arr[row][i]++;
//            }
//            for (int i = 0; i < m; i++) {
//                arr[i][col]++;
//            }
//
//        }
//        for (int[] ints : arr) {
//                for (int anInt : ints) {
//                    if (anInt % 2 != 0) {
//                        oddCount++;
//                    }
//                }
//                // System.out.println();
//            }
//        return oddCount;
//    }
//}