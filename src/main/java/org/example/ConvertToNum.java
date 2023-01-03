package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConvertToNum {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(ConvertToNum.summation(n));
    }

    public static int summation(int n) {

//        int temp=0;
//        for (int i = 1; i <= n; i++) {
//           temp += i;
//
//        }
//        return temp;
        int sums = IntStream.rangeClosed(1, n).sum();
        return sums;
    }
}
