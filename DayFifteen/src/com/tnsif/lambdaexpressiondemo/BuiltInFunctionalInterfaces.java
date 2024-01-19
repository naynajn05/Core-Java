package com.tnsif.lambdaexpressiondemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display

{
	static void show(String name) {
		System.out.println("Hi " + name);
	}
	
	public void print(String name) {
		System.out.println("Hello " + name);
	}
}

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		// Consumer
		Consumer<String> consumer = (str) -> System.out.println("Hello " + str);
		consumer.accept("Riddhesh");

		// method reference
		consumer = System.out::println;//non-static 
		consumer.accept("Sakshi");

		consumer = Display::show; //static
		consumer.accept("Sanket");
		
		consumer=new Display()::print; //non-static
		consumer.accept("Apurva");
		
		
		//Supplier
		Supplier<String> supplier=()-> "Hello all";
		System.out.println(supplier.get());
		
		//Predicate //positive number
		Predicate<Integer> predicate =(a)->a>0;
		System.out.println(predicate.test(12));
		System.out.println(predicate.test(-12));
		
		//Function  //max value test
		BiFunction<Integer,Integer,Integer> function=(a,b)->a>b ? a:b;
		System.out.println(function.apply(12, 18));
		
		BiFunction<String,Integer,String> function1=(name,b)-> name+b;
		System.out.println(function1.apply("Nayna", 18));
		
		
				
	}

}
