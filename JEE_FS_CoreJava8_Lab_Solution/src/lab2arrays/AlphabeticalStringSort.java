package lab2arrays;
import java.util.*;
public class AlphabeticalStringSort 
{
	public static String[] sortStrings(String[] arr) 
	{
		Arrays.sort(arr);
		int len = arr.length, i;
		String newArray[] = new String[len];
		
		for(i = 0; i<(int)Math.ceil(len/2)+1; i++)
			newArray[i] = arr[i].toUpperCase();
		
		for(i = (int)Math.ceil(len/2)+1; i<len; i++)
			newArray[i] = arr[i].toLowerCase();
		
		return newArray;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String entries[] = new String[num+1];
		
		for(int i=0; i<=num; i++)
			entries[i] = sc.nextLine();
		
		System.out.println("The resultant array is: ");
		String[] sortArray = sortStrings(entries);
		for(String value : sortArray)
			System.out.println(value);
		
		sc.close();	
	}

}