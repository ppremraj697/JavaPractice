package studentChallenges;
import java.util.Scanner;

public class Cuboid {
	
	public void area(int l, int b, int h) {
		
		int area = 2 * ((l*b)+(b*h)+(l*h));
		System.out.println("Area of the Cuboid is " + area);
	}
	
	public void volume(int l, int b, int h) {
		
		int volume = l * b * h;
		System.out.println("Volume of the Cuboid is " + volume);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length, breadth and height of the Cuboid ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int height = sc.nextInt();
		
		Cuboid cube = new Cuboid();
		cube.area(length, breadth, height);
		cube.volume(length, breadth, height);
	}

}
