//package org.example;
//
//import java.nio.CharBuffer;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class ReverseWords {
//
//    /*
//    "This is an example" --> "sihT si na elpmaxe"
//     */
//    public static void main(String[] args) {
//        String original = "This is an example";
////        String[] str = original.split(" ");
////        System.out.println(Arrays.toString(str));
//        System.out.println(reverseWord(original));
//    }
//
//    public static String reverseWord(final String original) {
////        String str2 ="";
////        String str1 = "";
////        String[] str = original.split(" ");
//////        StringBuilder sb = new StringBuilder(str1);
////        for(int i = 0; i < str.length; i++) {
//////            str1 = str[i];
////            for(int j = str[i].length()-1-i; j >= 0; j--) {
////                str1 = str1 + " " + str[j];
//////                StringBuilder sy = sb.reverse();
////            }
////        }
////        return str1;
//        char[] arr = original.toCharArray();
//        char[] arr1 = new char[arr.length];
//        for (int i = 0; i < arr.length / 2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        String str = String.valueOf(arr);
//
//        String[] s = str.split(" ");
//        for (int i = 0; i < s.length / 2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//    }
//
//}
