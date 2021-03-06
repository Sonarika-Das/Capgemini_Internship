// Create a method to check if a number is an increasing number
package labbook_solution;

import java.util.Scanner;

public class Ex_7_IncreasingNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("The number is an increasing number");
		else
			System.out.println("Not an increasing number");
	}
	
	static boolean checkNumber(int number)
	{
		int count=0;
		int r=number/10;
		number/=10;		
		while(number!=0)
		{
			int rem=number%10;
			if(rem>r)
			{
				count++;
				break;
			}
			r=rem;
			number/=10;
		}
		if(count>0)
			return false;   // print NOT increasing
		else
			return true;	// print Increasing
	}

}
