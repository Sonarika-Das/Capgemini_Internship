import java.util.Scanner;
public class ReverseStringWithoutStringFunction 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		str=sb.reverse().toString();
		System.out.println(str);
		sc.close();
	}

}
