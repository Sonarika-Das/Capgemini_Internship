package polymorphismCaseStudy2;

public class Transaction 
{
	private int accountNumber;
	private double currentBalance;
	
	/*public Transaction(int accountNumber,double mainBalance)		//constructor
	{
		this.accountNumber=accountNumber;
		this.currentBalance=currentBalance;
	}*/
	public int getAccountNumber()									//getter method
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber)					//setter method
	{
		this.accountNumber=accountNumber;
	}
	public double getcurrentBalance()									//getter method
	{
		return currentBalance;
	}
	public void setcurrentBalance(double currentBalance)					//setter method
	{
		this.currentBalance=currentBalance;
	}
	Transaction() {}
	void execute()
	{
		System.out.println("Banking Transaction Process");
	}
}
