package polymorphismCaseStudy2;

public class Deposit extends Transaction
{
	private double amount;
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	void execute()
	{
		System.out.println("The deposited amount is " + getAmount());
		setcurrentBalance(getcurrentBalance()+getAmount());
		System.out.println("The current balance is " + getcurrentBalance());
	}
}
