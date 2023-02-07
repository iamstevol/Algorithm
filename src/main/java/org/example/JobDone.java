package org.example;

import java.util.*;

public class JobDone {

    public static void main(String[] args) {

        ArrayList<Integer> jobs = new ArrayList<>(Arrays.asList(3, 10, 10, 20, 1, 2));
        int index = 2;
        System.out.println(sjf(jobs, index));
    }

    public static int sjf(ArrayList<Integer> jobs, int index) {
        int sum = 0;
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < jobs.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < jobs.size(); j++) {
                if (jobs.get(j) < min && jobs.get(j) > 0) {
                    min = jobs.get(j);
                    index = j;
                }
            }
            queue.offer(jobs.get(index));
            jobs.set(index, -1);
        }

        while (!queue.isEmpty()) {
            int currentJob = queue.poll();
            sum += currentJob;
        }

        return sum;
    }
}
