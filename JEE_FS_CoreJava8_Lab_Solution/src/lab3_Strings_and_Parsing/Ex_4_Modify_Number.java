/*
 * Exercise 4: Create a method that accepts a number and modifies it such that
 *  the each of the digit in the newly formed number is equal to the
 *   difference between two consecutive digits in the original number.
 *  The digit in the units place can be left as it is. 
 */
package lab3_Strings_and_Parsing;
import java.util.Scanner;
import java.lang.Math.*;
public class Ex_4_Modify_Number 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        int num = sc.nextInt();
        System.out.println("After modification  " + modifyNumber(num));
        sc.close();
	}
	static int modifyNumber(int num)
	{
		String str=String.valueOf(num);
		int diff=0;
		StringBuffer sbf=new StringBuffer();
		StringBuffer st= null;
		for(int i=1; i<str.length(); i++)
		{
			diff=Math.abs((int)(str.charAt(i))-(int)(str.charAt(i-1)));
			st=sbf.append(diff);
			if(i==str.length()-1)
			{
				st=sbf.append(str.charAt(i));
			}
		}
		
		String string=st.toString();
		int res=Integer.valueOf(string);
		return res;
	}
}
