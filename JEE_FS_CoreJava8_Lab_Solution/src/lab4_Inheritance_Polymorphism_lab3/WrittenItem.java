package lab4_Inheritance_Polymorphism_lab3;

public class WrittenItem extends Item
{
	private String author;

	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) 
	{
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
		this.author = author;
	}
	

//    Setters
	public void setAuthor(String ath) {
		this.author = ath;
	}

//    Getters
	public String getAuthor() {
		return author;
	}

	public int getIdentificationNumber() {
		return super.getIdentificationNumber();
	}
	
	
	
}
