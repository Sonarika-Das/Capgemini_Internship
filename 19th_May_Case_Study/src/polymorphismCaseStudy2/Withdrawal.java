package polymorphismCaseStudy2;

public class Withdrawal extends Transaction
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
	Transaction t=new Transaction();
	
	void execute()
	{
		System.out.println("The withdrawal amount is " + getAmount());
		System.out.println("The current balance is ");
		System.out.println(getcurrentBalance()-getAmount());
		setcurrentBalance(t.getcurrentBalance()-getAmount());
	}
}
