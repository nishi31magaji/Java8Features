package com.java.lambda.methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class MethodReferenceDemo {
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// 1. method reference to a static method
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));

		Function<Integer, Double> methodRefDemo = Math::sqrt;
		System.out.println(methodRefDemo.apply(9));

		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
		System.out.println(biFunctionLambda.apply(10, 20));
		BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferenceDemo::addition;
		System.out.println(biFunctionMethodRef.apply(10, 20));
		
		// 2. method reference to an instance method of an Object
		MethodReferenceDemo m = new MethodReferenceDemo();
		m.display("hello traditional!");
		
		Printable p = (msg) -> m.display(msg);
		p.print("hello lambda");
		
		Printable p2 = m::display;
		p2.print("Hello method reference");
		
		// 3. method reference to instance method of an arbitrary object
		// sometimes we call a method of argument in the lambda expression
		// in that case we can use a method reference to call an instance
		// method of an arbitrary object of a specific type.
		// here toLowerCase is a method of an argument which is of String type.
		Function<String,String>stringFunction = (str)->str.toLowerCase();
		System.out.println(stringFunction.apply("JAVA GUIDES"));
		Function<String,String>stringRef= String::toLowerCase;
		System.out.println(stringRef.apply("JAVA GUIDES"));
		
		//4. reference to a constructor
		List<String>fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		//convert list to set
		Set<String> set = new HashSet(fruits);
		System.out.println(set);
		Function<List<String>,Set<String>>setFunction= (fruitsList) -> new HashSet(fruitsList);
	    System.out.println(setFunction.apply(fruits));
	    
		Function<List<String>,Set<String>>setFunctionMethodRef= HashSet::new;
	    System.out.println(setFunctionMethodRef.apply(fruits));


	}

}
