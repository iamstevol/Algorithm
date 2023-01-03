package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Filter_String {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add(13);
        List<Object> listss = filterList(list);

        System.out.println(list);
        System.out.println(listss);
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> lists = new ArrayList<Object>();
        for(Object i : list) {
            if(i instanceof String) {
                continue;
            }
            lists.add(i);
        }
        return lists;
    }
}

