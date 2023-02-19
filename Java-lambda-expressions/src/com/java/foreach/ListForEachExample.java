package com.java.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Nishi",33));
		list.add(new Person("tony",40));
		list.add(new Person("tom",45));
		list.add(new Person("John",50));
		
		//without using forEach method prior to java 8
		for(Person p : list)
			System.out.println(p.getName());
		
		list.forEach((person) -> System.out.println(person.getName()));
		
		list.stream().forEach((person) -> System.out.println(person.getName()));

		list.stream().forEach(System.out::println);
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
