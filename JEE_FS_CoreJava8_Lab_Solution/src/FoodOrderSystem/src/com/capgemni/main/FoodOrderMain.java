package com.capgemni.main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.capgemni.service.CustomerService;

public class FoodOrderMain {
	static Connection con = null;
	static ResultSet rs = null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerService cs = new CustomerService();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","1234");
		
		char ch = 'y';
		String custName = null;
		String custEmail = null;
		String custPassword = null;
		String custPhoneNumber = null;
		do {
			
			System.out.println("Enter 1: CUSTOMER \t\t Enter 2: VENDOR");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter 1: SIGN UP \t\t Enter 2: LOG IN");
				int choice_1 = sc.nextInt();
				switch(choice_1) {
				case 1: 
					custName = cs.takeName();
					custEmail = cs.takeEmail();
					custPassword = cs.takePassword();
					custPhoneNumber = cs.takePhoneNumber();
					if(cs.tableExists("CUSTOMER_REGISTRATION", con)){
						cs.registerCustomer(custName,custPassword, custEmail, custPhoneNumber);
					}
					else {
						cs.createCustomerTable();
						cs.registerCustomer(custName,custPassword, custEmail, custPhoneNumber);
					}
					break;
				case 2: 
					custEmail = cs.takeEmail();
					custPassword = cs.takePassword();
					if(cs.loginCustomer(custEmail, custPassword)) {
						System.out.println("Log in Successfull.");
					}else {
						System.out.println("Email or password is wrong.");
					}
					break;
				default:
					System.out.println("Wrong Choice!");
				}
				break;
			case 2:
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			
		System.out.println("Enter y to continue");
		ch = sc.next().trim().charAt(0);
		}while(ch == 'y');
		
		
		
		
		
	}

}

/*
custName = cs.takeName();
custEmail = cs.takeEmail();
custPassword = cs.takePassword();
custPhoneNumber = cs.takePhoneNumber();
if(cs.tableExists("CUSTOMER_REGISTRATION", con)){
	cs.registerCustomer(custName,custPassword, custEmail, custPhoneNumber);
}
else {
	cs.createCustomerTable();
	cs.registerCustomer(custName,custPassword, custEmail, custPhoneNumber);
}
*/