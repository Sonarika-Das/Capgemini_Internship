package controlstatements;

import java.util.Scanner;

public class ValidateAge 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the age");
        int age=s.nextInt();
        if(age>18)
        {
        	System.out.println("age is valid");
        	System.out.println("you are eligible for voting");
        }
        else
        {
            	System.out.println("age is not valid");
            	System.out.println("you are not eligible for voting");
        }     

	}

}
