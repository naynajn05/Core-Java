//Program to demonstrate PreparedStatement Interface
package com.tnsif.preparedstatementdemo;



public class Executor {

	public static void main(String[] args) {
		System.out.println("Employee Details Retrieve Operation");	
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");
		PreparedStatementDemo.updateEmpName(201, "Kiran");
		PreparedStatementDemo.updateEmpSalary(201, 95000);
		System.out.println("Employee Details After Update Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		
		PreparedStatementDemo.addEmployee(305, "Megha", 98000);
		System.out.println("Employee Details After Create Operation");
		PreparedStatementDemo.showEmp();
		System.out.println("__________________________________");

		if(PreparedStatementDemo.deleteEmp(204)==false)
			System.err.println("No such employee...");
			else
				System.out.println("Employee removed....");
		System.out.println("Employee Details After Delete Operation");
		PreparedStatementDemo.showEmp();

	}

}
