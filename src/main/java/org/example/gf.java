package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class gf {


     public static int maxMarks(int[] marks, int minMark)
     { Set<Integer> usedMarks = new HashSet<>();
         int totalMarks = 0; for (int mark : marks) {
             int maxMark = Math.max(mark, minMark);
             while (usedMarks.contains(maxMark)) {
                 maxMark++;}
             usedMarks.add(maxMark);
             totalMarks += maxMark;
             minMark = maxMark;
         }
         return totalMarks;
     }
     public static void main(String[] args) {
         int[] input1 = {1, 2, 3, 4, 5};
         int[] input2 = {1, 3, 3, 5, 7};
         int output1 = maxMarks(input1, 1);
         int output2 = maxMarks(input2, 5);
         System.out.println("For input1: " + Arrays.toString(input1) + " the minimum total marks are " + output1);
         System.out.println("For input2: " + Arrays.toString(input2) + " the minimum total marks are " + output2);
     }
}

