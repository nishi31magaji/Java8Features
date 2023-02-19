package com.java.lambda.defaultstatic;

interface Vehicle {
	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlaramOn() {
		return "turning vehicle alarm on";
	}

	default String turnAlarmOff() {
		return "turning vehicle alarm off";
	}
	
	static String getCompany() {
		return "BMW";
	}
}
class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The car is slowing down";
	}
	//can we override default methods?
	@Override
	public String turnAlarmOff() {
		return "turning vehicle alarm off customized";
	} 
}
public class DefaultDemo {
public static void main(String[] args) {
	Car vehicle = new Car();
	System.out.println(vehicle.getBrand());
	System.out.println(vehicle.speedUp());
	System.out.println(vehicle.slowDown());
	
	System.out.println(vehicle.turnAlaramOn());
	System.out.println(vehicle.turnAlarmOff());
	System.out.println(Vehicle.getCompany());
}
}
