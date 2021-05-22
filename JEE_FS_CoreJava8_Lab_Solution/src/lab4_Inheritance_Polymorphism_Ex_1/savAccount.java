package lab4_Inheritance_Polymorphism_Ex_1;

public class savAccount extends Account
{
	final float minBalance=500;
	
	public void withdraw(double amount)
	{
		if(amount>minBalance)
			super.withdraw(amount);
		else
			System.out.println("Balance is lower than minimum balance");
	}
}
