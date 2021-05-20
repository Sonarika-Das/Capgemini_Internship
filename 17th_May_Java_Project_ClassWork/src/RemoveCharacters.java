/*
 * 4) Write a Java program to remove characters from the first string which are present in the second string?
 */
import java.util.Scanner;
public class RemoveCharacters 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String str2=sc.nextLine();
		System.out.println("After operation the 1st string is : " + removeChar(str1,str2));
		sc.close();
	}
	
	static String removeChar(String str1,String str2)
	{
		int ascii_values=256;
		char[] count_arr=new char[ascii_values];
		for(int i=0; i<str2.length(); i++)
		{
			count_arr[str2.charAt(i)]=1;
		}
		
		char[] res_arr=new char[str1.length()];
		int index=0;
		
		for(int i=0; i<str1.length(); i++)
		{
			if(count_arr[str1.charAt(i)]==0)
			{
				res_arr[index]=str1.charAt(i);
				index++;
			}
		}
		
		str1=new String(res_arr);
		return str1;
		
	}

}
