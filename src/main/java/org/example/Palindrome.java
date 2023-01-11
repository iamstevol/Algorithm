package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(palin2(str));
    }
    public static boolean palindrome(String str) {
        StringBuilder build = new StringBuilder(str);
        String str1 = (build.reverse()).toString();
        if(str1.equals(str)) {
            return true;
        }
        return false;
    }

    static boolean palin2(String str) {
      String lowerStr = str.toLowerCase();
        for (int i = 0; i <= lowerStr.length() / 2; i++) {
            char s = lowerStr.charAt(i);
            char e = lowerStr.charAt(lowerStr.length()-1-i);
            if(s != e) {
                return false;
            }
        }
        return false;
    }
}
