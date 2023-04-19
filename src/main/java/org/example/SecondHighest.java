package org.example;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1};
        int n = arr.length;
        int secondLargest = findSecondLargest(arr, n);
        System.out.println(secondLargest);
    }
    public  static int findSecondLargest (int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            } else {
                return 0;
            }
        }
        return secondLargest;
    }
}
