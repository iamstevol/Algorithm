package org.example;

import java.util.Arrays;

public class Shifted {

    public static void main(String[] args) {
        String first = "fatigue";
        String second = "tiguefa";
        System.out.println(shifts(first, second));
    }

    public static int shifted(String first, String second) {
        int count = 0;
        String[] str = first.split("");
        String[] str2 = second.split("");
        String[] str1 = Arrays.copyOf(str, str.length);
        for (int i = str1.length - 1; i >= 0; i--) {
            count++;
            str1[i] = str[str.length - 1 - i];
            if(str1.equals(str2)) {
                break;
            }
        }
        return count;
    }

    public static int shifts(String first, String second) {
        int count = 0;
        String[] str = first.split("");
        String[] str1 = second.split("");
        String[] s = {String.valueOf(str.length)};
        int right = str.length -1;
        int left = 0;
        for (int i = 0; i < str.length; i++) {
            count++;
            s[i] = str[str.length-1];
            if(s.equals(str1)) {
                return count;
            }


        }
        return count;
    }
}


