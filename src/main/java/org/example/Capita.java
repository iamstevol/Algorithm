package org.example;

public class Capita {

    public static void main(String[] args) {

    }

    public static String capitalAfterVowel(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<sb.length(); i++) {
            if((sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u' )) {
                String value = String.valueOf(str.charAt(i+1)).toUpperCase();
                sb.setCharAt(i + 1, value.charAt(0));
            }
        }
        return sb.toString();
    }
}
