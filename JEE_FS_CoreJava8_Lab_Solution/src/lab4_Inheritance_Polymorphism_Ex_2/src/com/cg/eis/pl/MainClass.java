package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmpService;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		EmpService emp1 = new EmpService();
		emp1.getDetails();
		emp1.insuranceScheme();
		emp1.empDetails();

		sc1.close();
		sc2.close();
	}

}
