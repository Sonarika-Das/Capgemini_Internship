package lab4_Inheritance_Polymorphism_lab3;

public abstract class Item 
{
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public void addItems() 
	{
		numberOfCopies += 1;
	}

	public void checkIn() 
	{
		numberOfCopies += 1;
	}

	public void checkOut() 
	{
		numberOfCopies -= 1;
	}

	public void print() 
	{
		System.out.println("Identification number: " + identificationNumber + "\nTitle: " + title
				+ "\nNumber of copies: " + numberOfCopies);
	}
	
}
