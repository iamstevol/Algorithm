package org.example.kunal;

import java.util.Arrays;

public class _2dArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] arr1 = search(arr, target);
        System.out.println(Arrays.toString(arr1));
        System.out.println(maxNum(arr));
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int maxNum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] arrNum : arr) {
            for(int element : arrNum) {
                if(element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
