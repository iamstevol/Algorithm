package org.example.kunal;

public class findNumOfDigitCount {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7869};
        int num = numOfEvenDigit(arr);
        System.out.println(num);
        System.out.println(Math.log10(3451));
    }

    public static int numOfEvenDigit(int[] arr) {
        int count = 0;
        for(int num : arr) {
          if(isEven(num)) {
              count++;
          }
        }
        return count;
    }

    public static boolean isEven(int count) {
        int digit = numOfDigit(count);
        return digit % 2 == 0;
    }

    public static int numOfDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return count;
    }
}
