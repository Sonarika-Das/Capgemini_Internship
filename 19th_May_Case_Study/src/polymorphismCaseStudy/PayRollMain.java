package polymorphismCaseStudy;

public class PayRollMain 
{
	public static void main(String[] args)
	{
		Academic a1=new Academic("Ram",10000);
		Admin a2=new Admin("Shyam",20000);
		
		System.out.println(a1.getName());
		System.out.println(a1.getSalary());
		a1.adjustSalary(20000);
		
		System.out.println(a2.getName());
		System.out.println(a2.getSalary());
		a2.adjustSalary(5000);
		
		
		
		System.out.println(a1.getName());
		System.out.println(a1.getSalary());
		
		System.out.println(a2.getName());
		System.out.println(a2.getSalary());
	}
}
