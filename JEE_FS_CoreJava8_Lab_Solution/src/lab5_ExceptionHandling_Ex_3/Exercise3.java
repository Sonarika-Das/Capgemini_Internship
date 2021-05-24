package lab5_ExceptionHandling_Ex_3;



public class Exercise3 {
   String firstname="Ramakrishna";
   String secondname=null;
	public void myData() throws NameException
	{
		if(firstname ==null)
		{
		throw new NameException("firstname is null");
		}
		else
			System.out.println("Correct input");
		
	
	if(secondname ==null)
	{
	throw new NameException("Secondname is null");
	}
	else
		System.out.println("Correct input");
	
}
	
	public static void main(String[] args) {
		try {
		 Exercise3 ud=new  Exercise3();
		 ud.myData();
		}
		catch(Exception ee)
		{
			System.out.println("I can handle  :"+ee);
		}
	}

}

