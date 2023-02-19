package com.java.streams;

public class Employee implements Comparable<Object> {
	private int id;
	private long salary;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int id, long salary, String name, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @Override public int compare(Object o1, Object o2) { Employee e1 = (Employee)
	 * o1; Employee e2 = (Employee) o2; if (e1.getSalary() > e2.getSalary()) return
	 * 1; else if (e1.getSalary() < e2.getSalary()) return -1; else return 0; }
	 */

}
