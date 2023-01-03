package org.example;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5,2,7,3,7};
        int[] rev = reverse(array);
        System.out.println(Arrays.toString(rev));
    }

    public static int[] reverse(int[] array) {
        int[] arr = new int[array.length];
        for(int i= (array.length - 1); i >= 0; i--) {
            arr[i] = array[array.length - i - 1];
        }
        return arr;
    }

    //Another method of Reversing an array[]
    public static int[] reverseArray2(int[] arrays) {
        int arr = arrays.length - 1;
        int div = (arrays.length) / 2;
        for(int i = 0; i < div; i++) {
            int temp = arrays[i];
            arrays[i] = arrays[arr - i];
            arrays[arr - i] = temp;
        }
        return arrays;
    }
}
