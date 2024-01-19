package com.tnsif.lambdademo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Display

{
	static void show(String s)
	{
		System.out.println(s);
	}
	
	public void disp(String s)
	{
		System.out.println(s);
	}
}

public class builtInFunctionalInterfaces {

	public static void main(String[] args) {
		//consumer Interface
		Consumer<String> consumer=(str)->{System.out.println("Welcome "+str);};
		consumer.accept("Anusha");
		
		consumer=System.out::println; //method reference instance method //non static
		consumer.accept("Harsh");
		
		consumer=Display::show;  //static method //user defined
		consumer.accept("Dilip");

		consumer=new Display()::disp;  //static method //user defined
		consumer.accept("sadik");
		
		//Supplier Interface
		Supplier<String> supplier=()-> "Good Afternoon students";
		System.out.println(supplier.get());
		
		//Predicate Interface //positive test
		Predicate<Integer> predicate=(a)->a>0;
		System.out.println(predicate.test(34));
		System.out.println(predicate.test(-34));
		
		//Bi-Function Interface //max test
		BiFunction<Integer,Integer,Integer> function=(x,y)-> x>y ?x:y;
		System.out.println(function.apply(23, 56));
		System.out.println(function.apply(23, 16));
		
		BiFunction<String,Integer,String> function1=(name,num)-> name+num;
		System.out.println(function1.apply("Nayna", 56));
	
	}

}
