package org.example.kunal;

public class MinNum {

    public static void main(String[] args) {
        int[] arr = {2,4,-6,2,8,4};
        System.out.println(minNum(arr));
    }

    public static int minNum(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }
}
