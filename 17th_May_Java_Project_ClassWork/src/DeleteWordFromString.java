// 12) Write a java program to delete a given word from the string?
import java.util.Scanner;
public class DeleteWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		System.out.println("Enter the word to delete: ");
		String wrd = sc.nextLine();
		wrd += " ";
		if(str.contains(wrd)) 
			str = str.replace(wrd, "");
		
		System.out.println("Final string: \n" + str);
		sc.close();
	}

}
