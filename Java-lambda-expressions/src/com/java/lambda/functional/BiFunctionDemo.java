package com.java.lambda.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

/*public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return (t+u);
	}
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>biFunction = new BiFunctionDemo();
		System.out.println(biFunction.apply(5, 9));
	}

}*/

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>biFunction =(t,u) -> (t+u);
		BiFunction<Integer, Integer, Integer>biFunctionSub =(t,u) -> (t-u);
		BiFunction<Integer, Integer, Integer>biFunctionMult =(t,u) -> (t*u);
		BiFunction<Integer, Integer, Integer>biFunctionDiv =(t,u) -> (t/u);

		Function<Integer,Integer> function = (number)-> number * number;
		// first apply biFunction method (addition of 2 numbers) then apply function 
		//multiplication of 2 numbers.
		Integer integer = biFunction.andThen(function).apply(10, 20);
		System.out.println("Integer"+ integer);
		System.out.println(biFunction.apply(5, 9));
		System.out.println(biFunctionSub.apply(200, 100));
		System.out.println(biFunctionMult.apply(200, 100));
		System.out.println(biFunctionDiv.apply(200, 100));


	}
}