//Create a method which accepts an array of integer elements and return 
//the second smallest element in the array
package lab2arrays;
import java.util.Scanner;
public class SecondSmallestElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array");
		for(int i=0; i<size; i++)
			arr[i]=sc.nextInt();
		System.out.println("The second smallest number is "+ secondSmallest(arr));
		sc.close();
	}
	
	static int secondSmallest(int[] arr)
	{
		int len=arr.length;
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len ; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr[1];
	}
}
