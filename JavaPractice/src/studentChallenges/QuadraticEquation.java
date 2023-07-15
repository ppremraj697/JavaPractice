package studentChallenges;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coefficients of the quadratic equation");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float d = (float)Math.sqrt(b*b - 4*a*c);
		
		float r1 = (-b + d)/(2f*a);
		float r2 = (-b - d)/(2f*a);
		
		System.out.println("Roots of the quadratic equation are " + r1 + " " + r2);
	}

}
