package polymorphismCaseStudy;

public class Academic extends PayRoll
{
	private String name;
	private int salary;
	
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary()
	{
		this.salary=salary;
	}
	
	public Academic(String name,int salary)      //constructor
	{
		this.name=name;
		this.salary=salary;
	}
	
	public void adjustSalary(int val)			//overriding
	{
		salary+=val;
		System.out.println("adjusted salary is "+ salary);
	}
	
	public void giveLecture()
	{
		System.out.println("Not enough instruction given...");
	}
}
