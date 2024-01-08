package com.tnsif.genericsdemo;

public class MINMaxImpl<T extends Comparable<T>> implements MinMax<T> {

	//array
		T [] values;
		//generic Constructor
		MINMaxImpl(T[] obj)
		{
			values=obj;
		}

	
//generic method
	@Override
	public T min() {
		T o1=values[0];
		 for(int i=1;i<values.length;i++)
		 {
		 if(values[i].compareTo(o1)<0)
		 {
			 o1=values[i];
		 }
		 }
		return o1;
	}

	@Override
	public T max() {
		T o1=values[0];
		 for(int i=1;i<values.length;i++)
		 {
		 if(values[i].compareTo(o1)>0)
		 {
			 o1=values[i];
		 }
		 }
		return o1;
	}

}
