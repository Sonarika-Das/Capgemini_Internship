/*
 2.Write a Java Program to find where given number has duplicated digits or not?
   print the duplicate number?
   hint: 144 = 4 is duplicated
 */

import java.util.*;
public class DuplicateDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int num=sc.nextInt();
		
		int[] arr=new int[10];
		
		while(num!=0)
		{
			int rem=num%10;
			arr[rem]++;
			num/=10;
		}
		int count=0;
		for(int i=0; i<10; i++)
		{
			if(arr[i]>1)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Number has Duplicate digits and the digits are :");
			for(int i=0; i<10; i++)
			{
				if(arr[i]>1)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("No duplicate digits");
		}
	}
}
