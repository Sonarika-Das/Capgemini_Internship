package polymorphismCaseStudy2;

public class BalanceInquiry extends Transaction
{
	private double balance;
	BalanceInquiry()
	{
		super();
	}
	public double getBalance()
	{
		return balance;
	}
	//Transaction tr=new Transaction();
	
	void execute(int val)
	{
		System.out.println("The account balance is " + getcurrentBalance());
	}
}
