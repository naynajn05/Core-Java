//to demonstrate looping and branching statements
package com.tnsif.scannerdemo;

public class TaxCalculation {
	
	public void calculateTax(Person person)
	{
		if(person.getGender().equalsIgnoreCase("female")|| person.getAge()>60)
		{
			person.setTax(0);
			System.out.println("No tax applicable");
		}
		else
		{
			if(person.getIncome()<160000)
			{
				person.setTax(0);
				System.out.println("No tax applicable for Male");
			}
			else if(person.getIncome()>160000 && person.getIncome()<=500000)
			{
				person.setTax((person.getIncome()-160000)*10/100);
				
			}else if(person.getIncome()>500000 && person.getIncome()<=800000)
			{
				person.setTax((person.getIncome()-160000)*20/100+34000);
				
			}else if(person.getIncome()>800000)
			{
				person.setTax((person.getIncome()-160000)*30/100+94000);
				
			}
		}
	}

}
