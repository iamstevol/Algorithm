package org.example.kunal;

public class MaximumWealth {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
