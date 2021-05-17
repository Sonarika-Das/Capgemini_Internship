package lab3_Strings_and_Parsing;

import java.util.Scanner;

public class Ex_8_Positive_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		if(isPositive(str))
			System.out.println("The string is POSITIVE");
		else
			System.out.println("The string is NEGATIVE");
		sc.close();
	}
	
	static boolean isPositive(String str)
	{
		int flag=0;
		char[] arr=str.toCharArray();
		for(int i=0; i<str.length()-1; i++)
		{
			if(arr[i]>arr[i+1])
				flag++;
		}
		if(flag>0)
			return false;
		else
			return true;
		
	}
}
