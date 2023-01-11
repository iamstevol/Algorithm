package org.example;

public class GetVowelCount {

    public static void main(String[] args) {
        String str = "Freshman bad man";
        System.out.println(getCount(str));
    }

    public static int getCount(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
