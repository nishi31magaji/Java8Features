package com.java.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExmaple {
public static void main(String[] args) {
	Map<Integer,Person> map = new HashMap<Integer,Person>();
	map.put(1, new Person("Nishi",33));
	map.put(2, new Person("Tony",44));
	map.put(3, new Person("Harry",50));
	
	//use for each loop
	for(Entry<Integer,Person> entry: map.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue().getName());
	}
	System.out.println("-------------------------------------");
	//user forEach method + lambda expression
	map.forEach((id,person)->System.out.println(person.getName()));
	
}
}
