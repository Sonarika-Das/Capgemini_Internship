//Create a method to check if a number is a power of two or not
package labbook_solution;
import java.util.Scanner;
public class Ex_8_PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println("Power of 2");
		else
			System.out.println("Not");
		sc.close();
	}
	
	static boolean checkNumber(int n)
	{
		if (n == 0)
			return false;
		while (n != 1) 
		{
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

}
