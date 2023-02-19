package com.java.lambda.functional;

import java.util.function.Function;

/*class FunctionImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}*/
public class FunctionDemo {
public static void main(String[] args) {
	//Function<String, Integer>function = new FunctionImpl();
	//System.out.println(function.apply("Ramesh"));
	
	
	Function<String, Integer>function =	(String t)-> t.length();
	System.out.println(function.apply("nishi"));
}
}
