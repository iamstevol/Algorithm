package org.example;

import java.util.*;

public class UniqueCharacter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 3, 2, 4, 3, 6, 7, 2));
        List<Integer> lists = removeDuplicate(list);
        lists.forEach(System.out::println);
    }

    public static List<Integer> removeDuplicate(List<Integer> list) {

        Set<Integer> newInt = new HashSet<>(list);
        return new ArrayList<>(newInt);
    }
}
