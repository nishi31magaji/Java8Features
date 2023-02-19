package com.java.lambda.functional;

import java.util.function.BiPredicate;

/*public class BiPredicateDemo implements BiPredicate<String, String>{
public static void main(String[] args) {
	BiPredicate<String,String>bipredicate= new BiPredicateDemo();
	System.out.println(bipredicate.test("nishi", "nishi"));
	System.out.println(bipredicate.test("Nishi", "nishi"));
}

@Override
public boolean test(String str1, String str2) {
	return str1.equals(str2);
}
}*/

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (String str1, String str2) -> str1.equals(str2);
		System.out.println(biPredicate.test("nishi", "nishi"));
		System.out.println(biPredicate.test("Nishi", "nishi"));
		BiPredicate<Integer,Integer>biPredicate2=(x,y)->x>y;
		BiPredicate<Integer,Integer>biPredicate3=(x,y)->x==y;
		boolean result = biPredicate2.and(biPredicate3).test(20, 10);
		System.out.println("result:"+result);
		
		boolean result1 = biPredicate2.or(biPredicate3).test(20, 10);
		System.out.println("result1:"+result1);

	}
}
