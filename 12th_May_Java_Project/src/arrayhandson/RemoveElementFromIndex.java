//write a Java program to remove an element by taking an index from the user?
package arrayhandson;

import java.util.Scanner;

public class RemoveElementFromIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the array: ");
		int[] arr= new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter the index: ");
		int index=sc.nextInt();

		for(int i = index; i < arr.length -1; i++)
		{
			arr[i] =arr[i + 1];
		}
		for(int i = 0; i < arr.length-1; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
