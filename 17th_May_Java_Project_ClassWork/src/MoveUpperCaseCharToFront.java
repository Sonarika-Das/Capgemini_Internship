//13) Write a java program to read a string and move all uppercase characters to the front?
import java.util.Scanner;
public class MoveUpperCaseCharToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		char[] str = sc.nextLine().toCharArray();
		String ans = "";
		
		for(char ch : str) 
			if(ch >= 65 && ch <= 91) 
				ans += ch;
		for(char ch : str) 
			if(ch >= 97 && ch <= 123) 
				ans += ch;		
		System.out.println("The modified string is: \n" + ans);
		sc.close();
	}

}
