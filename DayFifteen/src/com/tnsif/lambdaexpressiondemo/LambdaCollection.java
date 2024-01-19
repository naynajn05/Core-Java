// Program to demonstrate Lambda expression in collections
package com.tnsif.lambdaexpressiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(50);
		
		// Traversing using foreach
		for (Integer element : list) {
			System.out.println(element);
		}
		
		// Traversing using lambda expression
		System.out.println("Traversing using lambda expression");
		list.forEach(element -> System.out.println(element));
		
		//Traversing using Method Reference 
		System.out.println("Traversing using Method Reference");
		list.forEach(System.out::println);

		System.out.println("Original List "+list);
		
		Collections.sort(list);
		System.out.println("Sorting in Ascending Order " + list);

		Collections.reverse(list);
		System.out.println("Sorting in Descending Order " + list);

		// Lambda Expressions to sort in Descending order
		Comparator<Integer> comp = (n1, n2) -> n2 - n1;
		Collections.sort(list, comp);
		System.out.println("Sorting in Descending Order Using Lambda Expression " + list);

		// User Defined Type
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println(studentList);

		//Collections.sort(studentList); //CTE
		System.out.println("------------------------------------------");
				
		Comparator<Student> comp1 = (st1, st2) -> (int)(st1.getPer() - st2.getPer());
		Collections.sort(studentList,comp1); 
		System.out.println("Student details in Ascending order of Per : "+studentList);

		Collections.reverse(studentList);
		System.out.println("------------------------------------------");
		System.out.println("Student details in Descending order of Per : "+studentList);
		
		System.out.println("------------------------------------------");
		comp1 = (st1, st2) -> st1.getName().compareTo(st2.getName());
		Collections.sort(studentList,comp1); 
		System.out.println("Student details in ascending order of Student Name : "+studentList);
	}

}