package org.example;

import java.util.Arrays;

public class CountOfPositives {

    public static void main(String[] args) {
        int[] arr = countPositivesSumNegatives(new int[]{1,4,-2, -6});
        int[] arr2 = countPositivesSumNegatives(new int[]{1,4,-2,0, 5, -6});
        int[] arr3 = new int[]{};
        int[] arr4 = countPositivesSumNegatives(arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr4));

    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count = 0;
        int add = 0;
        int[] arr2 = new int[]{};
        if(input == null || input.length == 0) {
            return arr2;
        }
        int[] arr = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count = count + 1;
                arr[0] = count;
            } else if (input[i] < 0) {
                add = add + input[i];
//                count++;
                arr[1] = add;
            } else if (input[i] == 0) {
                continue;
            }
            else {
                return null;
            }
        }
        return arr;
    }
}
