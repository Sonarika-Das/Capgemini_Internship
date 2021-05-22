package lab4_Inheritance_Polymorphism_Ex_1;

public class currAccount extends Account
{
	final float overdraftLimit=50000;
	
	public void withdraw(double amount)
	{
		if(amount<overdraftLimit)
			super.withdraw(amount);		
		else
		{
			System.out.println("Overdraft limit reached");
		}
	}
}
