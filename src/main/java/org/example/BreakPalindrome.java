package org.example;

public class BreakPalindrome {
    public static String breakPalindrome(String palindromeStr) {
        int n = palindromeStr.length();
        for (int i = 0; i < n / 2; i++) {
            if (palindromeStr.charAt(i) != 'a') {
                return palindromeStr.substring(0, i) + 'a' + palindromeStr.substring(i + 1);
            }
        }
        return "IMPOSSIBLE";
    }

    public static void main(String[] args) {
        System.out.println(breakPalindrome("bab"));
    }
}
