package studentChallenges;
import java.util.Scanner;

class TestCylinder{
	
	//ACHIEVING DATA HIDING
	private int radius;
	private int height;
	
	//READING RADIUS AND HEIGHT 
	public int getRadius() {
		return radius;
	}
	public int getHeight() {
		return height;
	}
	
	//WRITING RADIUS, HEIGHT AND/OR DIMENSION
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setDimension(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	//CONSTRUCTOR
	public TestCylinder(){
		System.out.println("Calling default Constructor...");
		this.radius = 0;
		this.height = 0;
	}
	public TestCylinder(int radius) {
		System.out.println("Calling Parameterized Constructor with Radius...");
		this.radius = radius;
		this.height = 1;
	}
	public TestCylinder(int radius, int height) {
		System.out.println("Calling Parameterized Constructor with Radius and Height...");
		this.radius = radius;
		this.height = height;
	}
}

public class Cylinder1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of Cylinder ");
		int radius = sc.nextInt();
		
		System.out.println("Enter height of the Cylinder ");
		int height = sc.nextInt();
		
		TestCylinder tc = new TestCylinder();
		tc.setRadius(radius);
		tc.setHeight(height);
//		tc.setDimension(radius, height);
		System.out.println("Radius of Cylinder is: "+tc.getRadius());
		System.out.println("Height of Cylinder is: "+tc.getHeight());

		
		TestCylinder tc1 = new TestCylinder(radius);
//		tc1.setRadius(radius);
		tc1.setHeight(height);
//		tc1.setDimension(radius, height);
		System.out.println("Radius of Cylinder is: "+tc1.getRadius());
		System.out.println("Height of Cylinder is: "+tc1.getHeight());
		
		TestCylinder tc2 = new TestCylinder(radius, height);
//		tc1.setRadius(radius);
//		tc1.setHeight(height);
//		tc1.setDimension(radius, height);
		System.out.println("Radius of Cylinder is: "+tc2.getRadius());
		System.out.println("Height of Cylinder is: "+tc2.getHeight());
		
	}

}
