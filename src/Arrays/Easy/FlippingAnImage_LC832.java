//https://leetcode.com/problems/flipping-an-image/description/
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

package Arrays.Easy;

import java.util.Arrays;

public class FlippingAnImage_LC832 {
    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int[] a: image) {
            int start = 0;
            int end = a.length-1;
            while(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = (image[i][j])^1;
            }
        }

        System.out.println(Arrays.toString(image));
    }
}
//LC
//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        for (int[] a: image) {
//            int start = 0;
//            int end = a.length-1;
//            while(start < end){
//                int temp = a[start];
//                a[start] = a[end];
//                a[end] = temp;
//                start++;
//                end--;
//            }
//        }
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                image[i][j] = (image[i][j])^1;
//            }
//        }
//        return image;
//    }
//}
