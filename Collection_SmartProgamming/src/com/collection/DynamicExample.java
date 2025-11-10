package com.collection;

import java.util.ArrayList;

public class DynamicExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // no size defined
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Add as many elements as needed
        list.add(60);  // ✅ Works fine
        list.add(70);  // ✅ Works fine

        System.out.println(list);
    }
}
