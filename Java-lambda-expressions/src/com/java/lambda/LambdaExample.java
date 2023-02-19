package com.java.lambda;

interface Shape {
	 void draw();
	 default void m1() {
		 System.out.println("default method m1");
	 }
}

public class LambdaExample {
	public static void main(String[] args) {
		Shape rectangle = () -> {
			System.out.println("rectangle class : draw() method");

		};
	//	rectangle.draw();

		Shape square = () ->System.out.println("Square class : draw() method");
	//	square.draw();

		Shape circle = () -> System.out.println("Circle class : draw() method");
	//	circle.draw();
		
		/*print(rectangle);
		print(square);
		print(circle);*/
		
		
		//we can pass lambda expression directly as method param
		print(() -> System.out.println("Rectangle class : draw() method"));
		print(() -> System.out.println("Square class : draw() method"));
		print(() -> System.out.println("Circle class : draw() method"));
	}
	//how to pass lamda expression as method parameter
	
	private static void print(Shape shape) {
		shape.draw();
	}
}
