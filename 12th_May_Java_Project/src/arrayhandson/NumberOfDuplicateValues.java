/*
Write  a Java Program to count number of duplicated values in
a) integer array
b) char array (create the char array in lower case)
 */
package arrayhandson;
import java.util.Scanner;
public class NumberOfDuplicateValues 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length::");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();     
        System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }
        }
        
        
        
        
        System.out.println("Enter char array length::");
        int m = sc.nextInt();
        char array[]=new char[m];
        System.out.println("Enter the array elements::");
        for(int i=0;i<m;i++)
        	array[i]=sc.next().charAt(0);     
        System.out.println("Duplicate characters in given array:: ");    
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }
        }

	}

}
