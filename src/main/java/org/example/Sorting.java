package org.example;

import java.util.Arrays;

public class Sorting {

    public static void main (String [] args) {
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}

