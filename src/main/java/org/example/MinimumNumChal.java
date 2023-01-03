package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumChal {
    public static void main(String[] args) {

        int[] returnedInt = readInteger();
        System.out.println(Arrays.toString(returnedInt));

        int returnedMin = findMin(returnedInt);
        System.out.println(returnedMin);
    }

    public static int[] readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a list of number");
        String num = scanner.nextLine();
        String[] arr = num.split(",");
        int[] arr1 = new int[arr.length];
        for(int i=0; i< arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        return arr1;
    }
    public static int findMin(int[] arr1) {
        int min = Integer.MAX_VALUE;
        for(int el : arr1) {
            if(el < min) {
                min = el;
            }
        }
        return min;
    }
}
