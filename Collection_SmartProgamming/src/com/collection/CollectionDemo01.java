package com.collection;

import java.util.*;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // List example
        List<String> names = new ArrayList<>();
        names.add("Aniket");
        names.add("Malika");
        names.add("Aniket"); // allows duplicates
        System.out.println("List: " + names);

        // Set example (no duplicates)
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Set: " + uniqueNames);

        // Queue example (FIFO)
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        System.out.println("Queue: " + queue);

        // Map example (Key → Value)
        Map<Integer, String> rollMap = new HashMap<>();
        rollMap.put(1, "Aniket");
        rollMap.put(2, "Malika");
        System.out.println("Map: " + rollMap);

        // Using Collections utility
        Collections.sort(names);
        System.out.println("Sorted List: " + names);
    }
}
