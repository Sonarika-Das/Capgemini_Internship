package lesson2_Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(15, 20);
		tri.set_values(30, 50);
		
		System.out.println("Area of the rectangle = " + rec.getArea());
		System.out.println("Area of the triangle = " + tri.getArea());
	}

}
