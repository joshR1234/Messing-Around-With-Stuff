package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Person> arr = new ArrayList(3);
		arr.add(new Person(20, "Peter", 43));
		arr.add(new Person(11, "Alex", 23));
		arr.add(new Person(33, "Tim", 22));
		arr.add(new Person(15, "Trace", 21));
		Collections.sort(arr);
		arr.forEach(a -> System.out.println(a));

		// Collections.sort(arr, new NameSort());
		Collections.sort(arr, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("*******************");
		arr.forEach(a -> System.out.println(a));

	}

}
