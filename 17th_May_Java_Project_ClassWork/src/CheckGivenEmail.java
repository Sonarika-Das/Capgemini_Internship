// 14) Write a java program to check the given email contains @ and .?
import java.util.Scanner;
public class CheckGivenEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email address: ");
		String email = sc.nextLine();
		if(email.contains("@") && email.contains("."))
			System.out.println("Email address contains '@' and '.'");
		else if(email.contains("@") && !(email.contains(".")))
			System.out.println("Email address contains '@' but not '.'");
		else if(email.contains(".") && !(email.contains("@")))
			System.out.println("Email address contains '.' but not '@'");
		else
			System.out.println("Email address doesn't contain '@' and '.'");
		sc.close();
	}

}
