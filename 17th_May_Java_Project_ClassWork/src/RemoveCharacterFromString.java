// 8) how to remove a given character from a string?
import java.util.Scanner;
public class RemoveCharacterFromString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the character u want to remove");
		char ch=sc.next().charAt(0);
		String s="";
		char[] arr=str.toCharArray();
		for(char cha : arr)
		{
			if(cha!=ch)
			{
				s+=cha;
			}
		}
		System.out.println(s);
	}

}
