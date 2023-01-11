package org.example.kunal.binarysearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-2, -5, 6, 98, 432};
        int target = 6;
        int a = binarySearch(arr, target);
        System.out.println(a);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
