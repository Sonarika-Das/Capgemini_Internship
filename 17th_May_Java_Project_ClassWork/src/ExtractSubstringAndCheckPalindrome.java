// 11) Write a java program to extract a substring and check whether extracted substring is palindrome or not?
import java.util.Scanner;
public class ExtractSubstringAndCheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter beginning index for the substring: ");
		int init = sc.nextInt();
		
		System.out.println("Enter closing index for the substring: ");
		int fin = sc.nextInt();
		
		String subStr = str.substring(init, fin+1);
		int subStrLen = subStr.length()-1;
		for(int i = 0; i <= subStrLen/2 + 1; i++) 
			if(subStr.charAt(i) != subStr.charAt(subStrLen-i)) {
				System.out.println("String \"" + subStr + "\" is not a Palindrome");
				System.exit(0);
			}
		System.out.println("String \"" + subStr + "\" is a Palindrome");
		sc.close();
	}

}
