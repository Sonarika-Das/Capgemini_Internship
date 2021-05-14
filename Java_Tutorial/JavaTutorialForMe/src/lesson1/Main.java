package lesson1;

public class Main 
{
	public static void kgf(String S)
	{
		System.out.println("String");
	}
	public static void kgf(Object S)
	{
		System.out.println("Object");
	}
	public static void main(String[] args) 
	{
		kgf(null);
	}
}
