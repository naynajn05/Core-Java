package com.tnsif.covariantdemo;

//base class
 class Color {
	
	protected Color getColor()
	{
		
		Color obj=new Color();
		return obj; 
	}

	
}


//child class
class Red extends Color
{
	public Red getColor()
	{
		
		Red obj1=new Red();
		return obj1; 
	}
	
}

//child class
class Yellow extends Color
{
	public Yellow getColor()
	{
		
		Yellow obj1=new Yellow();
		return obj1; 
	}
	
}
class Blue extends Color
{
	public Blue getColor()
	{
		Blue obj1=new Blue();
		return obj1; 
	}
}

 class Demo
{
	public static void main(String[] args) {
		Color obj=new Color();
		Red obj1=new Red();
		Yellow obj2=new Yellow();
		System.out.println(obj.getColor());
		System.out.println(obj1.getColor());
		System.out.println(obj2.getColor());
		
	}
}
