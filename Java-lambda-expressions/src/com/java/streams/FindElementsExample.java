package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {
public static void main(String[] args) {
	List<Integer>list = Arrays.asList(11,2,3,2,1);
	Optional<Integer> firstEle=list.stream().findFirst();
	if(firstEle.isPresent())
		System.out.println(firstEle.get());
	else
		System.out.println("stream is empty");
	
	Optional<Integer>anyEle = list.stream().findAny();
	if(anyEle.isPresent())
		System.out.println(anyEle.get());
	else
		System.out.println("stream is empty");
}
}
