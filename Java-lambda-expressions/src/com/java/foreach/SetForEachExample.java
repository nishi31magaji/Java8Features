package com.java.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachExample {
public static void main(String[] args) {
	List<Person> list = new ArrayList<Person>();
	list.add(new Person("Nishi",33));
	list.add(new Person("tony",40));
	list.add(new Person("tom",45));
	list.add(new Person("John",50));
	
	Set<Person> set = new HashSet<Person>(list);
	System.out.println(set);
	//for each  loop
	System.out.println("--------------------------------------------------");

	for(Person p : set) {
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
	
	// for each method + lambda
	System.out.println("--------------------------------------------------");

	set.forEach((person) -> System.out.println(person.getName()));
	
	//for each method + stream
	System.out.println("--------------------------------------------------");
	set.stream().forEach((person) -> System.out.println(person.getName()));
}
}
