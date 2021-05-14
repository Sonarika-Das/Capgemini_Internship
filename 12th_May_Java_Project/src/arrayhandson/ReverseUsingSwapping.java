/*
 Write a program to print array elements in the reverse order using swapping method?
	Hint: take even number array
	input: 20 30 40 50 60 70
	output: 70 60 50 40 30 20
 */
package arrayhandson;
import java.util.Scanner;
public class ReverseUsingSwapping 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length.");
		int len=sc.nextInt();
		
		int[] arr=new int[len];
		
		System.out.println("Enter the array");
		for(int i=0; i<len; i++)
		{
			arr[i]=sc.nextInt();
		}
		int i,j;
		for(i=0, j=(len-1); ;)
		{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
			i++;j--;
			
			if((i+1)==j || i==j)
			{
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				break;
			}	 
		}
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}


}
