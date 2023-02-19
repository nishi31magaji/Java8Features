package com.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
public static void main(String[] args) {
	List<String> fruits = new ArrayList<String>();
	fruits.add("banana");
	fruits.add("mango");
	fruits.add("apple");
	fruits.add("pineapple");
	fruits.add("grapes");
	//sort ascending order
	List<String>sortedList=
		fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(fruits);
	System.out.println(sortedList);
	List<String>sortedList2= fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println(sortedList2);
	List<String>sortedList3= fruits.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList3);
	
	
	//sort descending order
	
	List<String>sortedListdesc=
			fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedListdesc);

	List<String>sortedListdesc2=fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
	System.out.println(sortedListdesc2);
	
	List<Employee>employeeList = new ArrayList<Employee>();
	employeeList.add(new Employee(1, 30000, "john k", 24));
	employeeList.add(new Employee(3, 25000, "maria D", 23));
	employeeList.add(new Employee(4, 35000, "Dan r", 26));
	employeeList.add(new Employee(2, 20000, "Riva L", 21));
	
	
	//sort ascending order

	List<Employee>employeeListSorted = employeeList.stream().sorted().collect(Collectors.toList());
	System.out.println(employeeListSorted);
	
	List<Employee>employeeListSorted2 = employeeList.stream().sorted(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getSalary()-o2.getSalary());
		}
	}).collect(Collectors.toList());
	
	System.out.println(employeeListSorted2);
	
	List<Employee>employeeListSorted3 =
	employeeList.stream().sorted((Employee o1, Employee o2)-> (int) (o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
	System.out.println(employeeListSorted3);

	//sort descending order

	List<Employee>employeeListDesc = 
			employeeList.stream().sorted((Employee e1,Employee e2) -> (int)(e2.getSalary() - e1.getSalary())).collect(Collectors.toList());
	System.out.println(employeeListDesc);
	
	//sort ascending order using Comparator method
	List<Employee>employeeSortedList1 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
	System.out.println(employeeSortedList1);

	//sort descending order
	
	List<Employee>employeeSortedList2 = employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
	System.out.println(employeeSortedList2);
	
	//sort ascending order by age using Comparator method
		List<Employee>employeeAgeSortedList = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		System.out.println(employeeAgeSortedList);
		
	//sort descending order by age using Comparator method

		List<Employee>employeeAgeDesc = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println(employeeAgeDesc);
	
		System.out.println("------------------------------------------------------------");	
	
	//sort by name ascending
		
		List<Employee>employeeNameAsc = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(employeeNameAsc);
		
	//sort by name descending
		List<Employee>employeeNameDesc = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println(employeeNameDesc);
		
		
}
}
