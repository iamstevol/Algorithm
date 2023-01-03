package org.example;

import java.util.Arrays;

public class CountOfPositives {

    public static void main(String[] args) {
        int[] arr = countPositivesSumNegatives(new int[]{});
        System.out.println(Arrays.toString(arr));
    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count = 0;
        int add = 0;
        int[] arr = new int[2];
        for(int i=0; i<input.length; i++) {
            if(input[i] > 0) {
                arr[0] = count + 1;
                count++;
            }else if(input[i] < 0) {
                add = add + input[i];
                count++;
                arr[1] = add;
            } else if(input[i] == 0) {
                continue;
            } else {
                return null;
            }
        }
        return arr;
    }
}
