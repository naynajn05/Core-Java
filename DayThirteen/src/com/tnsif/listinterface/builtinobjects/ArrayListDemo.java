//to demonstrate ArrayList class
package com.tnsif.listinterface.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList(); //Dynamic binding,loose coupling
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		list1.add(1);
		list1.add(20);
		list1.add(67.4f);
		list1.add("Nayna");
		list1.add(false);
		list1.add('A');
		list1.add(20);
		
		System.out.println("is null added to the list? "+list1.add(null));
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		System.out.println(list1.contains(2));
		//System.out.println(list1.remove(20));//RTE 
		System.out.println("which element is removed " +list1.remove(2));
		System.out.println("the element at index 5- "+list1.get(5));
		System.out.println("index of 20 "+list1.lastIndexOf(20));
		
		System.out.println("after removal of 20, list  is "+list1);
		
		list1.add("Gauri");
		list1.add("Sanket");
		System.out.println(list1);
		System.out.println(list1.size());
		
		//sort
		//Collections.sort(list1); //no CTE  //RTE
		System.out.println(list1); //ClassCastException
		
		list1.clear();
		System.out.println(list1); 
		

		
		//use generics to create list-Homogeneous list
		List<String> names=new ArrayList<String>();
		names.add("Gauri");
		names.add("Sanket");
		names.add("Apurva");
		names.add("Pratiksha");
		//names.add(10);
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		

		/*
		 * List<Object> list2=new ArrayList<Object>(); list2.add(12); list2.add(names);
		 * System.out.println(list2);
		 */
		
		//Traverse a list
		System.out.println("----------------------");
		Iterator<String> i=names.iterator();
		while (i.hasNext())
		{
			String str=i.next();
			System.out.println(str);
			if(str.equals("Gauri"))
				i.remove();
		}
		System.out.println(names);
		
		//traverse in the backward direction
		ListIterator<String> ll=names.listIterator(names.size());
		while(ll.hasPrevious())
		{
			String lstr=ll.previous();
			System.out.println(lstr);
		}
	}

}
