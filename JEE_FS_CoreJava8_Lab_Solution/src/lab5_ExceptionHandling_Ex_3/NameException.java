package lab5_ExceptionHandling_Ex_3;


class NameException extends Exception
{
	NameException(String message)
	{		
		System.out.println("Your name is  " +message);
	}

}
