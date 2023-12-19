//Main class for Bank application
package com.tnsif.interfacedemo1;

public class BankApplication {
 public static void main(String[] args) {
     // Create a Bank instance
     Bank HDFC = new BankImpl(); //Dynamic Binding

     // Create an Account
     Account account = new Account(123456, "Nayna", 155000, HDFC);

     // Deposit money
     account.deposit(2000);
     // Print the account details
     System.out.println(account);
     
     //withdraw money
     account.withdraw(10000);
     // Print the account details
     System.out.println(account);
 }
}