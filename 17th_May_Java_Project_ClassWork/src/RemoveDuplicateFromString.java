import java.util.Scanner;

/*
 * 2) Write a java program to remove all duplicates from a given string?
 */
public class RemoveDuplicateFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("The resultant string is : " + removeDuplicate(str));
		sc.close();
	}
	static Object removeDuplicate(String str)
	{
		StringBuilder string=new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int index=str.indexOf(ch, i+1);
			if(index==-1)
				string.append(ch);
		}
		return string;
	}
}
