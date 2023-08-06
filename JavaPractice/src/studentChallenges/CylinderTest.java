package studentChallenges;
import java.util.Scanner;

class Cylinder{
	
	int radius;
	int height;
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double lidArea() {
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea() {
		return (2*lidArea())+ (circumference()*height);
	}
	
	public double volume() {
		return lidArea()*height;
	}
}

public class CylinderTest {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter radius and height of the cylinder");
		c1.radius = sc.nextInt();
		c1.height = sc.nextInt();
		
		double circumference = c1.circumference();
		System.out.println("Circumference of the cylinder is "+circumference);

		double lidArea = c1.lidArea();
		System.out.println("Lid Area of the Cylinder is "+ lidArea);
		
		double totalSurfaceArea = c1.totalSurfaceArea();
		System.out.println("Total surface area of the Cylinder is "+ totalSurfaceArea);
		
		double volume = c1.volume();
		System.out.println("Volume of the Cylinder is "+volume);
	}

}
