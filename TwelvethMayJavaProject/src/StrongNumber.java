/*
 1.Write a Java Program to find where given number is strong number or not?
   hint: 145 = 1! + 4! + 5! = 145
 */
import java.util.*;

public class StrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. to check whether it is strong or not");
		int num=sc.nextInt();
		int var=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int fact= factorial(rem);
			sum=sum+fact;
			num/=10;
		}
		if(var==sum)
		{
			System.out.println("This is a Strong number.");
		}
		else
		{
			System.out.println("This is not a Strong number.");
		}
	}
	
	static int factorial(int x)
	{
		int res=1;
		for(int i=x;i>0;i--)
		{
			res=res*i;
		}
		return res;
	}

}
