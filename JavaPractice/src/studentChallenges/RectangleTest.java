package studentChallenges;
import java.util.Scanner;

class Rectangle{
	
	int length;
	int breadth;
	
	public int area() {
		return length*breadth;
	}
	
	public int perimeter() {
		return 2*(length+breadth);
	}
	
	public boolean isSquare() {
		return length==breadth;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of the rectangle");
		
		Rectangle r1 = new Rectangle();
		r1.length = sc.nextInt();
		r1.breadth = sc.nextInt();
		
		int area = r1.area();
		System.out.println("Area of the rectangle is " + area);
		
		int perimeter = r1.perimeter();
		System.out.println("Perimeter of the rectangle is "+perimeter);
		
		boolean isSquare = r1.isSquare();
		System.out.println("Is this rectangle a square? "+ isSquare);
	}

}
