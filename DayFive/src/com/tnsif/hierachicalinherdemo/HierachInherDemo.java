//to demonstrate hier.Inher.-Driver Class
package com.tnsif.hierachicalinherdemo;

public class HierachInherDemo {

	public static void main(String[] args) {
		Person p=new Person();  //object //tight coupling//static binding
		System.out.println(p);
		
		Person p1; //obj reference
		//loose coupling //Dynamic Binding //run time poly
		p1=new Person("Gauri",20,"A Positive");
		System.out.println(p1);
		
		p1=new Engineer();
		System.out.println(p1);
		
		p1=new Student();
		System.out.println(p1);
	

	}
	

}
