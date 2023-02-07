package org.example.kunal.binarysearch;

import java.util.Arrays;

public class BinarySearch2D {
    /*
    Row-wise, Column-wise Sorted 2D Array
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45, 47},
                {28, 29, 38, 50},
                {36, 39, 45, 55},
        };
        int target = 47;
        System.out.println(Arrays.toString(binary2DSearch(matrix, target)));
    }

    public static int[] binary2DSearch(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if(matrix[r][c] < target) {
               r++;
           } else {
               c--;
           }
        }
        return new int[]{-1, -1};
    }
}
