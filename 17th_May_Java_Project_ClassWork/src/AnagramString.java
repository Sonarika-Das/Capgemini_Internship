import java.util.Scanner;

/*
 * 5) Write a java program to check if two strings are anagram are not?
 */
public class AnagramString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String str2=sc.nextLine();
		if(isAnagram(str1,str2))
			System.out.println("Both strings are Anagram");
		else
			System.out.println("Not Anagram");
		sc.close();
	}
	
	static boolean isAnagram(String str1,String str2)
	{
		int ascii_value=256;
		int[] arr=new int[ascii_value];
		for(int i=0; i<str1.length(); i++)
		{
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int i=0; i<ascii_value; i++)
		{
			if(arr[i]!=0)
				return false;
		}
		return true;
	}
}
