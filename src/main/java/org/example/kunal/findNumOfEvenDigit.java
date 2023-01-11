package org.example.kunal;

public class findNumOfEvenDigit {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int a = findNumOfEven(arr);
        System.out.println(a);
    }

    public static int findNumOfEven(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count ++;
            }
        }
        return count;
    }

}
