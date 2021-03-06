/*
 Exercise 4: Write a Java program that prompts the user for an integer and then
  prints out all the prime numbers up to that Integer?
 */
package laboptionaljefs;
import java.lang.Math;
import java.util.Scanner;
class PrimeNumber
{
	// function check whether
	// a number is prime or not
	static boolean isPrime(int n)
	{
		// Corner case
		if (n <= 1)
			return false;
 
		// Check from 2 to n-1
		for (int i = 2; i <=Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
 
		return true;
	}
 
// Function to print primes
	static void printPrime(int n)
	{
		for (int i = 2; i <= n; i++)
		{
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}
 
// Driver Code
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		printPrime(n);
	}
}
 