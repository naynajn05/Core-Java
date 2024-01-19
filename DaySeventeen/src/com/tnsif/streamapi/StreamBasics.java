//to demonstrate Stream Basic methods
package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// create a stream from a set of values
//way 1
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60);// stream source

		// stream.forEach(System.out::println); //terminal
		// count the no of elements //terminal

		long count = stream.count(); // terminal
		System.out.println(count);

		// way 2
		Integer[] values = new Integer[] { 10,10,46, 29, 46, 78, 88, 77 }; //source
		//created stream from Array
		stream=Arrays.stream(values);
		
		//map
		System.out.println("-----------------------");
		stream.map(num->num+2).forEach(System.out::println);
		
		// limit 
		System.out.println("First 2 elements are : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);

		// skip 
		System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(4).forEach(System.out::println);

		// distinct 
		System.out.println("Distinct Elements are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);

		//way 3//collection
		List<String> words = Arrays.asList("Hello", "Stream", "Learning");
		//words.add("In Java"); //Immutable list
		
		// creating a stream from a List
		Stream<String> stream1 = words.stream();

		// map
		System.out.println("Strings in uppercase : ");
		List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		stream1 = words.stream();
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println(words);

	}

}
