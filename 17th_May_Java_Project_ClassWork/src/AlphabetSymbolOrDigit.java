// 10) Write a java program to check whether a given index is alphabet or symbol or digit?

import java.util.Scanner;
public class AlphabetSymbolOrDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a index to check the character: ");
		int ind = sc.nextInt();
		char c = str.charAt(ind);
		if((c >= 65 && c <= 91) || (c >= 97 && c <= 123))
			System.out.println("The index is an alphabet.");
		else if(c >= 48 && c <= 57)
			System.out.println("The index is a digit.");
		else 
			System.out.println("The index is a symbol.");
		sc.close();
		
	}

}
