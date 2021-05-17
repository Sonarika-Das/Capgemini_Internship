/*
 * Create a class containing a method to create the mirror image of a String.
 * The method should return the two Strings separated with a pipe(|) symbol .
 */
package lab3_Strings_and_Parsing;

import java.util.Scanner;

public class Ex_2_Mirror_Image 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("The mirror image is  "+ str + "|" + getImage(str));
        sc.close();
	}
	
	static String getImage(String str)
	{
		/*
		String rev=new StringBuffer(str).reverse().toString();
		return str.concat("|").concat(rev);
		*/
		
		return new StringBuffer(str).reverse().toString();
	}

}
