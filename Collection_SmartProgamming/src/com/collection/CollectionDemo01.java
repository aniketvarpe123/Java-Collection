package com.collection;

import java.util.*;

public class CollectionDemo01 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("Aniket");
		names.add("Rahul");
		names.add("Pratik");
		names.add("Sharvi");
		names.add("Sharvi");

		System.out.println(names);

		// Set unique

		Set<String> uniqueNames = new HashSet<>(names);
		System.out.println(uniqueNames);

		// Queue example (FIFO)
		Queue<String> queue = new LinkedList<>();
		queue.add("Task1");
		queue.add("Task2");
		queue.add("Task3");

		System.out.println(queue);

		// Map example(Key value)
		Map<Integer, String> rollMap = new HashMap<>();

		rollMap.put(1, "Aniket");
		rollMap.put(2, "Sagar");

		System.out.println(rollMap);

		// Using Collection utility
		Collections.sort(names);

		System.out.println("Sorted List : " + names);

	}
}
