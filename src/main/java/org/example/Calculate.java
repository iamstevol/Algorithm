package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculate {

    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5};
        System.out.println(packArray(integers));

    }

    public static int packArray(int[] integers) {
//        for(int i=0; i<integers.toArray().length; i++) {
//            return ((integers.get(i) + integers.get(i + 1)
//        public int reduceArray(int[] arr) {
        int result = integers[0];
        int i = 1;
        for (int j = 1; j < integers.length; j += 2) {
            int x = integers[j];
            int y = integers[j + 1];
            if (i % 2 == 1) {
                result += x + y;
            } else {
                result *= x * y;
            }
            i += 1;
        }
        return result;
    }
}
