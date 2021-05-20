//  7) Find the non-repeating character in a given string?
import java.util.*;
public class NonRepeatingCharacter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("The resultant string is " + nonRepeatingCharacter(str));
		sc.close();
	}
	static String nonRepeatingCharacter(String str)
	{
		int ascii_value=256;
		char[] arr=new char[ascii_value];
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i)]++;
		}
		int j=0;
		char[] res_arr=new char[str.length()];
		for(int i=0; i<ascii_value; i++)
		{
			if(arr[i]==1)
			{
				res_arr[j]=(char)(i);
				j++;
			}
			
		}
		String st=String.valueOf(res_arr);
		return st;
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char[] arr=new char[str.length()];
		char[] res_arr=new char[str.length()];
		int j=0;
		arr=str.toCharArray();
		Arrays.sort(arr);
		if(arr[0]!=arr[1])
		{
			res_arr[j]=arr[0];
			j++;
		}
		for(int i=1; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
			{
				res_arr[j]=arr[i];
				j++;
			}
		}
		if(arr[arr.length-1]!=arr[arr.length-2])
		{
			res_arr[j]=arr[arr.length-2];
			j++;
		}
		String st=String.valueOf(res_arr);
		return st;
		//return String.valueOf(res_arr);
		 * */
		 
	}

}
