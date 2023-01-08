package org.example;

public class SquareEachValueOfAnArray {

//    [1, 2, 3]  ===
    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 2};
        System.out.println(squ(n));
    }

    public static int squ(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += (int) Math.pow(n[i], 2);
        }
        return result;
    }
}
