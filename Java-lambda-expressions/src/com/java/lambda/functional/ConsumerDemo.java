package com.java.lambda.functional;

import java.util.function.Consumer;

/*class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}*/
public class ConsumerDemo {
	public static void main(String[] args) {
		//Consumer<String> c = new ConsumerImpl();
		//c.accept("hello world");
		//no need of return type to the variable
		//as java compiler identify it from the parameter passed
		Consumer<String>consumer = (t) -> System.out.println(t);
		consumer.accept("nishi");
	}

}
