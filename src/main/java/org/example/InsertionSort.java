package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] number = {2,6,4,9,4,1};
        System.out.println(Arrays.toString(insertionSort(number)));
    }

    static int[] insertionSort(int[] number) {
        int len = number.length;
        for(int i=1; i<len; i++) {
            int j = i - 1;
            int temp = number[i];
            while(j>=0 && number[j] > temp) {
                number[j + 1] = number[j];
                j=j-1;
            }
            number[j+1] = temp;
        }
        return number;
    }
}
