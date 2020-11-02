package com.example;


public class Person implements Comparable<Person> {
	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return id + ":" + name + ":" + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		if (this.id < p.id)
			return -1;
		else if (this.id > p.id)
			return 1;
		else
			return 0;
	}

}
