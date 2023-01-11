package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int x = 3;
        int[] arr = new int[]{1, 2, 8, 10, 10, 12, 19};
        System.out.println(numCeiling(arr, x));
    }

    public static int numCeiling(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return x;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start >= arr.length) {
            return -1;
        }
        return arr[start];
    }
}

