//Create a method which accepts an integer array, 
//reverse the numbers in the array and returns the resulting array in sorted order
package lab2arrays;
import java.util.*;

public class Ex_3_ReverseNumberAndSort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		
		System.out.println("Enter array");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int[] res_arr= getReversedSorted(arr);
		for(int element : res_arr)
			System.out.println(element);
		sc.close();
	}
	
	static int[] getReversedSorted(int[] arr)
	{
		int len = arr.length;
		for(int i = 0; i < len; i++) 
		{
			String str = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			str = sb.toString();
			arr[i] = Integer.parseInt(str);
		}
		for(int i = 0; i < len; i++) 
			for(int j = 0; j < len; j++) 
				if(i != j && arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
		return arr;
		
	}

}





/*
=====>> The Integer class wraps a value of the primitive type int in an object.
  An object of type Integer contains a single field whose type is int.
In addition, this class provides several methods 
for converting an int to a String and a String to an int, 
as well as other constants and methods useful when dealing with an int.




*/