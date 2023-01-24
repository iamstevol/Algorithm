package org.example;

public class SquareNum {

    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 2};
        System.out.println(squareSum(n));
    }

    public static int squareSum(int[] n) {
        int[] arr = new int[n.length];
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum += (int)Math.pow(n[i], 2);
        }
        return sum;
    }
}
