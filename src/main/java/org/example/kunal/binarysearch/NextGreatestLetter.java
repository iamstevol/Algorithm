package org.example.kunal.binarysearch;

import java.util.Arrays;

public class NextGreatestLetter {


    /* Given a character array letters that  is sorted in non-decreasing order and a character target
     * return the smallest character in the array that is larger than target
     *  example
     * input = ['a','b'] target = 'z'
     * output ='a
     *
     * input =['c', 'f', 'j '] target = 'a'
     *output = 'c'
     *  */
    public static void main(String[] args) {
        char[] arr = new char[]{'c','f','j'};
        char target = 'd';
        char arr1 = check(arr, target);
        System.out.println(arr1);
    }

    public static char check(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return arr[mid + 1] ;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start >= arr.length) {
            return arr[0];
        }
        return arr[start];
    }
}
