//to demonstrate user defined generic class
package com.tnsif.genericsdemo;

public class GenericClass<T>{
	
  T data;
  
  void set(T data)
  {
	  this.data=data;
  }
	
 T get()
 {
	return data; 
 }
}
