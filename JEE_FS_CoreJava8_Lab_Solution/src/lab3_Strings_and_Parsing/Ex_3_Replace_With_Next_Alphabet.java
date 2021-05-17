/*
 *  Create a method which accepts a String and replaces all the consonants 
 *  in the String with the next alphabet. 
 */

package lab3_Strings_and_Parsing;
import java.util.Scanner;
public class Ex_3_Replace_With_Next_Alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("String after alteration is  " + alterString(str));
        sc.close();
	}
	
	static String alterString(String str)
	{
		char[] arr=str.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(isConsonant(arr[i]))
			{
				arr[i]=(char)(arr[i]+1);
			}
		}
		String st=new String();
		st=String.valueOf(arr);
		return st;
	}
	
	static boolean isConsonant(char ch)
	{
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
				ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
			return true;
		else 
			return false;
	}

}
