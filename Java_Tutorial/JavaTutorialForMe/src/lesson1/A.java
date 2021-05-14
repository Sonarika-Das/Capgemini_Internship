package lesson1;

public class A 
{
	public static void main(String[] args) 
	{
		String s = new String("abc");
		System.out.println("S = " + s);
		System.gc();
		s = null;
		System.out.println("S = " + s);
		s = "12345678";
		System.out.println(s.substring(0, 0));
	}
}
