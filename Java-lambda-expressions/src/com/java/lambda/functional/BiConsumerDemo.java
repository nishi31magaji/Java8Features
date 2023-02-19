package com.java.lambda.functional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*public class BiConsumerDemo implements BiConsumer<Integer, Integer> {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = new BiConsumerDemo();
		biConsumer.accept(10, 20);
	}

	@Override
	public void accept(Integer a, Integer b) {
		System.out.println(a + b);
	}
}*/

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t + u);

			}
		};
		biConsumer.accept(30, 40);

		BiConsumer<Integer, Integer> biConsumerAdd = ( t,  u) -> System.out.println(t + u);
		BiConsumer<Integer, Integer> biConsumerSub = ( t,  u) -> System.out.println(t - u);
		BiConsumer<Integer, Integer> biConsumerMult = ( t,  u) -> System.out.println(t * u);
		BiConsumer<Integer, Integer> biConsumerDiv = ( t,  u) -> System.out.println(t / u);
		
		biConsumerAdd.accept(100,200);
		biConsumerSub.accept(100,200);
		biConsumerMult.accept(100,200);
		biConsumerDiv.accept(100,200);
		System.out.println("--------------------------------------------");
		Map<Integer,String>map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "JavaScript");
		map.put(3, "R");
		map.put(4, "GoLang");
		
		map.forEach((t, u) -> System.out.println(t +" "+u));

	}
}
