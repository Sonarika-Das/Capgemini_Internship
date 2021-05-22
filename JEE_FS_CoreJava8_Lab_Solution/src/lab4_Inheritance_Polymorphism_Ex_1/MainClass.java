package lab4_Inheritance_Polymorphism_Ex_1;

public class MainClass 
{
	
	public static void main(String[] args)
	{
		long min=200000000;
		long max=900000000;
		Person smith=new Person();
		smith.setName("Smith");
		smith.setBalance(2000);
		smith.deposit(2000);
		smith.setAccNum((int)(Math.random()*(max-min+1)+min));
		
		Person kathy=new Person();
		kathy.setName("Kathy");
		kathy.setBalance(3000);
		kathy.withdraw(2000);
		kathy.setAccNum((int)(Math.random()*(max-min+1)+min));
		
		System.out.println(smith.getAccNum());
		System.out.println(smith.getBalance());
		
		System.out.println(kathy.getAccNum());
		System.out.println(kathy.getBalance());
		
	}
	
}
