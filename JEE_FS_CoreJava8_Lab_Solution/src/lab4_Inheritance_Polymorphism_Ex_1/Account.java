package lab4_Inheritance_Polymorphism_Ex_1;

public class Account 
{	
	long accNum;
	double balance;
	Person accHolder;   //doubt
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance()
	{
		
		return balance;
	}
	
	//currAccount curr=  new currAccount();  //creating this object to check overdraft of money, whether withdraw or not
	//savAccount sav=  new savAccount();	   
		
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		//curr.withdraw(amount);
		//sav.withdraw(amount);
		balance-=amount;
	}
	
	
}
