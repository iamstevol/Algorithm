package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Challenge {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 4, 2));
        List<Integer> arr = arrayOfProducts(array);
        arr.forEach(System.out::println);
    }

    public static List<Integer> arrayOfProducts(List<Integer> array) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size() ; i++) {
            int result = 1;
            for (int j = 0; j < array.size(); j++) {
                if(!Objects.equals(array.get(j), array.get(i))) {
                    result *= array.get(j);
                }
            }
            list.add(result);
        }
        return list;
    }
}
