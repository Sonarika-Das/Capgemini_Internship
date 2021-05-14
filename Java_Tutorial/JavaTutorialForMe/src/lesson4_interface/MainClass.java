package lesson4_interface;

public class MainClass {

	public static void main(String[] args) {	
		Bank abc = new BankABC();
		abc.getInterestRate();
	}
}

/*
class - class  			=> "extends"
interface - class 		=> "implements"
interface - interface 	=> "extends"
*/