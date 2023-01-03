package org.example;

import java.util.stream.Stream;

public class AverageCalculator {

    public static void main(String[] args) {
        int[] classPoints = { 9,9,9,9,9,9};
        int yourPoints = 8;
        System.out.println(AverageCalculator.betterThanAverage(classPoints,yourPoints));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum=0;
        for(int i=0; i< classPoints.length; i++) {
            int num=classPoints[i];
            sum +=num;

            if(yourPoints > ((sum+yourPoints)/(classPoints.length+1))) {
                return true;
            }
        }
        return false;
    }
}
