//Write a Java program to merge two unsorted arrays of different lengths?

package arrayhandson;
import java.util.*;

class MergeUnsortedArray
{
    public static void merge(int a[], int b[],int res[], int n,int m)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) 
        {
            if (a[i] <= b[j]) 
            {
                res[k] = a[i];
                i += 1;
                k += 1;
            } 
            else 
            {
                res[k] = b[j];
                j += 1;
                k += 1;
            }
        }   
       while (i < n) 
       { 
           res[k] = a[i];
           i += 1;
           k += 1;
       }   
        while (j < m) 
        {   
        	res[k] = b[j];
            j += 1;
            k += 1;
        }
    }
     
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the sizes of two arrays: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
    	System.out.print("Enter two arrays: ");
		int[] a= new int[n];
		int[] b= new int[m];
		
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		n = a.length;
        m = b.length;
      
        int res[] = new int[n + m];
        merge(a, b, res, n, m);
      
        System.out.print( "Sorted merged list :");
        for (int i = 0; i < n + m; i++)
            System.out.print(" " + res[i]);  
    }
}