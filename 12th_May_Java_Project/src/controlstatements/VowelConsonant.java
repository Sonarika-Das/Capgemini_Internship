package controlstatements;
import java.util.Scanner;
public class VowelConsonant 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char choice;
		char[] arr=new char[10];
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.next().trim().charAt(0);
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || 
					arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
				choice='V';
			else if((arr[i]<'a' && arr[i]>'z') || (arr[i]<'A' || arr[i]>'Z') )
				choice='S';
			else
				choice='C';
			
			switch(choice)
			{
			case 'V':
				System.out.println(arr[i] + "  is a vowel");
				break;
			case 'S':
				System.out.println(arr[i] + "  is a Symbol");
				break;
			case 'C':
				System.out.println(arr[i] + "  is a Consonant");
				break;
			}
				
		}
		
	}

}
