package com.example;

import java.util.Set;
import java.util.TreeSet;

public class SortedMain {

	public static void main(String[] args) {
		Set<Person> ss = new TreeSet<>(); // natural
		ss.add(new Person(20, "Peter", 43));
		ss.add(new Person(11, "Alex", 23));
		ss.add(new Person(33, "Tim", 22));
		ss.add(new Person(15, "Trace", 21));

		System.out.println(ss);

	}

}
