package org.example;

import java.util.Arrays;

public class NumberToArray {

    public static void main(String[] args) {
        int[] n = numToArray(143);
        System.out.println(Arrays.toString(n));
    }

    public static int[] numToArray(int n) {
        String num = String.valueOf(n);
        char[] nums = num.toCharArray();
//        StringBuilder st = new StringBuilder(num);
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(nums[i]));
        }
        return result;
    }
}
