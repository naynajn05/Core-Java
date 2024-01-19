//to demonstrate database setting
package com.tnsif.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Import java.sql package
• Load and register the driver
• Establish a connection to the database server
• Create a statement
• Execute the statement
• Retrieve the result
• Close the statement and connection*/

public class DBUtil {
	//Load and register driver -Class.forName()
	
	private static Connection con;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_URL="jdbc:mysql://localhost:3306/test";
	private static final String DB_user_name="root";	
	private static final String DB_password="Sanavi@05";
	
	public static Connection getConnection()
	{
		
			try {
				
				//Load and register driver -Class.forName()
				Class.forName(DB_DRIVER_CLASS);
				System.out.println("Driver is loaded successfully....");
				
				//Establish a connection to the database server
				con=DriverManager.getConnection(DB_URL, DB_user_name, DB_password);
				System.out.println("Connection is established successfully...");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver class is not found "+e.getMessage());
			} catch (SQLException e) {
				System.out.println("Connection failed "+e.getMessage());
			}
			return con;
	

		
	}
}

