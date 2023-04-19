package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";

        System.out.println(sunsetViews(buildings, direction));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {


        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < buildings.length - 1; i++) {

                if ((Objects.equals(direction, "EAST") && (buildings[i] <= buildings[i + 1]) )) {
                    list.add(i + 1);
                    list.add(buildings.length - 1);
//                if(buildings[i] == buildings[buildings.length - 1]) {
//                    break;
//                }
                }

        }
        return list;



    }
}