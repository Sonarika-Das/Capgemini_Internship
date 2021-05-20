// 9) count the number of words in the given string?
import java.util.Scanner;
public class CountNumberOfWords 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int flag=0;
		char[] arr=str.toCharArray();
		for(char ch : arr)
		{
			if(ch==' ')
				flag++;
		}
		System.out.println(flag+1);
	}

}
