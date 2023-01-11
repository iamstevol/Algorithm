package org.example;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {

    /*
    [a, b, c] --> [1: a, 2: b, 3: c]
     */
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("a");
        lines.add("b");
        lines.add("c");
        System.out.println(number(lines));
    }

    public static List<String> number(List<String> lines) {
        List<String> line = new ArrayList<>();
        int count = 1;
        for(String str : lines) {
            String s = count + ":" + str;
            count++;
            line.add(s);
        }

        return line;
    }
}
