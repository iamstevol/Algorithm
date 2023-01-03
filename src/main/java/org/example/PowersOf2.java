package org.example;

import java.util.*;

public class PowersOf2 {
    public static void main(String[] args) {
        long[] pow = powersOfTwo(2);
        System.out.println(Arrays.toString(pow));
    }

    public static long[] powersOfTwo(int n) {
        long[] arr = new long[n + 1];
        for(int i=0; i < arr.length; i++) {
            arr[i] = (long) Math.pow(2, i);
        }
        return arr;
    }
}

