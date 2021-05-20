/*
 * How to find maximum occurring character in a given string?
 */
import java.util.Scanner;
public class Max_Occuring_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("The maximum occurring character is : " + maxOccurringChar(str));
		sc.close();
	}
	static char maxOccurringChar(String str)
	{
		int[] arr=new int[256];  //there are 256 ascii values
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i)]++;
		}
		int max=-1;
		char res=' ';
		for(int i=0; i<str.length(); i++)
		{
			if(max<arr[str.charAt(i)])
			{
				max=arr[str.charAt(i)];
				res=str.charAt(i);
			}
		}
		return res;
	}
}
