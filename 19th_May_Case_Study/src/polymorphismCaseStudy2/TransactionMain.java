package polymorphismCaseStudy2;
import java.util.Scanner;
public class TransactionMain 
{

	public static void main(String[] args) 
	{
		Deposit d=new Deposit();
		Withdrawal w=new Withdrawal();
		BalanceInquiry b=new BalanceInquiry();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int accountNumber=sc.nextInt();
		System.out.println("Enter the currentBalance");
		double currentBalance=sc.nextDouble();
		
		System.out.println("Press 1 for Deposit");
		System.out.println("Press 2 for Withdrawal");
		System.out.println("Press 3 for BalanceInquiry");
		int key=sc.nextInt();
		
		/*t.setAccountNumber(accountNumber);
		t.setcurrentBalance(currentBalance);
		
		System.out.println("Account number is : " + t.getAccountNumber());
		System.out.println("Current balance is : " + t.getcurrentBalance());
		
		
		if(key==1)
		{
			System.out.println("Enter amount for Deposit");
			double amount=sc.nextDouble();
			d.setAmount(amount);
			d.execute();
		}*/
		if(key==1)
		{
			d.setAccountNumber(accountNumber);
			d.setcurrentBalance(currentBalance);
			System.out.println("Account number is : " + d.getAccountNumber());
			System.out.println("Current balance is : " + d.getcurrentBalance());
			System.out.println("Enter amount for Deposit");
			double amount=sc.nextDouble();
			d.setAmount(amount);
			d.execute();
		}
		if(key==2)
		{
			w.setAccountNumber(accountNumber);
			w.setcurrentBalance(currentBalance);
			System.out.println("Account number is : " + w.getAccountNumber());
			System.out.println("Current balance is : " + w.getcurrentBalance());
			System.out.println("Enter amount for Withdrawal");
			double amount=sc.nextDouble();
			w.setAmount(amount);
			w.execute();
		}
		if(key==3)
		{
			b.setAccountNumber(accountNumber);
			b.setcurrentBalance(currentBalance);
			System.out.println("Account number is : " + b.getAccountNumber());
			System.out.println("Current balance is : " + b.getcurrentBalance());
			b.getBalance();
		}
	}

}
