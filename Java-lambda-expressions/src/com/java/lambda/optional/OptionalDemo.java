package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
public static void main(String args[]) {
//to create optional object (instance of optional class)
//	use these methods of, empty, ofNullable
	String email = null;
	Optional<Object>emptyOptional = Optional.empty();
	System.out.println(emptyOptional);
	
	//whenever we are sure that this string email is not null then only use of method
	//else it will throw NullPointerException
	//Optional<String>emailOptional = Optional.of(email);
	//System.out.println(emailOptional);
	
	//ofNullable does not throw null pointer exception
	
	// in case of null value it throws empty object of optional class
	// Optional.empty in case of null value
	//Optional[Value] in case of non null value

	Optional<String>stringOptional = Optional.ofNullable(email);
	//System.out.println(stringOptional.get());
	
	/*
	 * if(stringOptional.isPresent()) System.out.println(stringOptional.get()); else
	 * System.out.println("No value present");
	 */
	
	//to get default value from Optional class use orElse() method
	String defaultOptional = stringOptional.orElse("default@gmail.com");
	System.out.println(defaultOptional);
	
	//orElseGet()takes lambda expression as parameter.
	String defaultOptional2 = stringOptional.orElseGet(() ->"default@gmail.com");	
	System.out.println(defaultOptional2);
	
	//orElseThrow method to throw exception when value is not present in optional class

//	String orElsThrowOptional = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email does not exist"));
//	System.out.println(orElsThrowOptional);
	
	//ifPresent()
	Optional<String> gender = Optional.of("male");
	gender.ifPresent((String t) ->System.out.println("value is present"));
	
	Optional<?> emptyOptional2 = Optional.empty();
	emptyOptional2.ifPresent((s) -> System.out.println("value is not there"));
	
	String result = " abc ";
	if(result!=null && result.contains("abc"))
		System.out.println(result);
	
	Optional<String>result2 = Optional.ofNullable(result);
	result2.filter(a->a.contains("ab"))
	.map((s) -> s.trim())
	.ifPresent((s) -> System.out.println(s));
	//System.out.println(result2.get());
	
	//map method in Optional provides a way to transform value in Optional from one type to another.
}
}
