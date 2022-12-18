package org.example;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] sort_arr) {

        int len = sort_arr.length;
        boolean isSwapped;

        for (int i=0; i<len-1; i++) {
            isSwapped = false;
            for(int j=0; j<len-1-i; j++) {
                if(sort_arr[j] > sort_arr[j+1]) {
                    int swap= sort_arr[j];
                    sort_arr[j]=sort_arr[j+1];
                    sort_arr[j+1]=swap;

                }
            }
        }
        return sort_arr;
    }

    public static void main(String[] args) {
        int[] array = {2,1,7,3,5};
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(array)));
    }
}
