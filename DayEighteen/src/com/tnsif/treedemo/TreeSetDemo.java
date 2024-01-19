//To demonstrate TreeSet
package com.tnsif.treedemo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//String TreeSet
		TreeSet<String> courses=new TreeSet<String>();
		courses.add("Core java");
		courses.add("Python");
		courses.add("Hibernate");
		courses.add("SpringBoot");
		courses.add("Angular");
		courses.add("HTML");
		courses.add("CSS");
		//courses.add(null);//RTE //Null pointer 
		System.out.println(courses);

		
		//sorted set to create subset
		Set<String> CoursesSubset=courses.subSet("CSS",true, "Python",true);
		System.out.println(CoursesSubset);
		
		courses.add("React");
		courses.add("JavaScript");
		System.out.println(courses);
		System.out.println(CoursesSubset);
		
		
		
		courses.remove("React");
		System.out.println(courses);
		System.out.println(CoursesSubset);
		
		
		// Adding User defined objects in TreeSet
				TreeSet<Student> students = new TreeSet<Student>();
				students.add(new Student(101, "Harshita", 87));
				students.add(new Student(104, "Pallavi", 71));
				students.add(new Student(103, "Anisha", 67));
				students.add(new Student(102, "Sheetal", 72));
				students.add(new Student(102, "Sheetal", 72));
				//students.add(new Student(null, "null", null));
				System.out.println("Student details are as follows\n" + students);

				// Integer TreeSet
				TreeSet<Integer> numberSet = new TreeSet<Integer>();
				numberSet.add(10);
				numberSet.add(20);
				numberSet.add(60);
				numberSet.add(80);
				numberSet.add(30);
				System.out.println(numberSet);

				SortedSet<Integer> numberSet1 = numberSet.subSet(20, true, 60, true);
				System.out.println(numberSet);
				System.out.println(numberSet1);

				numberSet.add(400);
				numberSet.add(50);
				System.out.println(numberSet);
				System.out.println(numberSet1);

				numberSet1.add(35);
				//numberSet1.add(95);// RTE IllegalArgumentException - Key out of range
				System.out.println(numberSet);
				System.out.println(numberSet1);

	}

}
