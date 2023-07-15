package studentChallenges;
import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
	
	public void area() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sides of the triangle");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float s = (a+b+c)/2f;
		
		float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of the Triangle is "+ area);
	}
	
	public void area2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base and height of the triangle");
		
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		
		float area = (1.0f/2)*base*height;
		
		System.out.println("Area of triangle is " + area);
	}

	public static void main(String[] args) {
		
		AreaOfTriangle a1 = new AreaOfTriangle();
		a1.area();
		a1.area2();
	}

}
