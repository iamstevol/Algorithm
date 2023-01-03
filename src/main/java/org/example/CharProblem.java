package org.example;

public class CharProblem {

    public static void main(String[] args) {
        String obj = String.valueOf(howOld("5 is my age"));
        System.out.println(obj);

    }
    public static int howOld(final String herOld) {

        String str = herOld.substring(0,1);
        return Integer.parseInt(str);
        //your code here, return correct age as int ; )

    }
}
