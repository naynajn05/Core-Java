//to demonstrate Linked list
package com.tnsif.listinterface.builtinobjects;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(60);
		ll.add(70);
		ll.add(90);
		ll.add(20);
		ll.add(50);
		ll.add(120);
		ll.add(20);
		ll.add(25);
		//ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
		
		Iterator<Integer> intList=ll.iterator();
		while(intList.hasNext())
		{
			//Integer intData=intList.next();
			System.out.println(intList.next());
	}
		ListIterator<Integer> listData=ll.listIterator(ll.size());
		while(listData.hasPrevious())
		{
			Integer intData=listData.previous();
			System.out.println(intData);
			if(intData==90)
				listData.add(1111);
			if(intData==60)
				listData.set(5555);

}
		
		System.out.println(ll);
}
}
