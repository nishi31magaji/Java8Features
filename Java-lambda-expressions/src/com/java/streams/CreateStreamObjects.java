package com.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
public static void main(String[] args) {
	//create a Stream
	Stream<String>stream = Stream.of("a","b","c");
	stream.forEach(System.out::println);
	
	//create stream from collection
	Collection<String> collection = Arrays.asList("Java","J2EE","Spring");
	Stream<Object> list =collection.stream().map((t) -> t.toUpperCase());
	list.forEach((t) -> System.out.println(t));
	
	//create stream from list
		List<String> list2 = Arrays.asList("Java","J2EE","Spring");
		Stream<String> strim2 =list2.stream();
		strim2.forEach(System.out::println);
	
	//create a stream from hashset
	Set<String> set = new HashSet<>(list2);
	Stream<String> strim3=set.stream();
	strim3.forEach(System.out::println);
	
	//create a stream from array object
	String[] strArray = {"a","b","c"};
	Stream<String> streamArray = Arrays.stream(strArray);
	streamArray.forEach(System.out::println);
	
	
}
}
