package lab2arrays;
import java.util.*;
public class Ex_4_RemoveDuplicate 
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
		int[] res_arr= modifyArray(arr);
		for(int element : res_arr)
			System.out.println(element);
		sc.close();
	}

	static int[] modifyArray(int[] arr)
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			hs.add(arr[i]);
		}
		int[] a=new int[hs.size()];
		int i = 0;
		  for (Integer val : hs) 
			  a[i++] = val;
		return a;
	}
}
