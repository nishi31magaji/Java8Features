package com.java.lambda.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*class SupplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}*/
public class SupplierDemo {
	public static void main(String[] args) {
		// Supplier<LocalDateTime> s = new SupplierImpl();
		// System.out.println(s.get());

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		System.out.println(s.get());

	}
}
