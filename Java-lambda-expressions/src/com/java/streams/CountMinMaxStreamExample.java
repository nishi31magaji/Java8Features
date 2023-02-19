package com.java.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class CountMinMaxStreamExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(stream.count());
		Integer integer1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
		Integer integer2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing((t) -> Integer.valueOf(t))).get();

		System.out.println("Min ==>" + integer1);
		
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println("Min ==>" + integer2);
		
		Integer maxVal = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max==>"+ maxVal);

	}
}
