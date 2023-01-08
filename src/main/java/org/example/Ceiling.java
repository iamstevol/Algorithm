package org.example;

import java.util.Arrays;

public class Ceiling {
    /*Given a sorted array and a value x, the ceiling of x is the smallest element in an array greater than or equal to x,
    and  Assume that the array is sorted in non-decreasing order.
    Write efficient functions to find the ceiling of x.
            Examples :
    For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
    For x = 0:     ceil  = 1
    For x = 1:     ceil  = 1
    For x = 5:     ceil  = 8
    For x = 20:    ceil doesn't exist in array*/
    public static void main(String[] args) {
        int x = 2;
        int[] arr = new int[]{1, 2, 8, 10, 10, 12, 19};
        System.out.println(xCeiling(x, arr));
    }
    public static int xCeiling (int x, int[] arr) {
        return Arrays.binarySearch(arr, x);
//        int ceil = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(x == arr[i]) {
//                ceil = arr[i];
//            }
//            else if(x < arr[0]) {
//                ceil = arr[0];
//            } else if ((x > arr[0]) && (x < arr[2])) {
//                ceil = arr[2];
//            } else if (x > arr[1] && x < arr[3]) {
//                ceil = arr[2];
//            } else if (x > arr[2] && x < arr[4]) {
//                ceil = arr[3];
//            } else if (x > arr[3] && x < arr[5]) {
//                ceil = arr[4];
//            }
//            if(x > arr[arr.length -1]) {
//                System.out.println("ceil does not exist in array");
//                break;
//
//            }
//
//        }
//
//
//        return ceil;
    }
}
