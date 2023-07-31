package studentChallenges;
import java.util.Scanner;

public class OverloadValidateMethod {
	
	public int area(int l, int b) {
		return l*b;
	}
	
	public double area(double r) {
		return Math.PI*r*r;
	}
	
	public void reverse(int A[]) {
		
		int B[] = new int[A.length];
		
		System.out.println("Array before reversing");
		for(int x : A) {
			System.out.print(x+" ");
		}
		
		for(int i = 0; i < A.length; i++) {
			B[i] = A[A.length-i-1];
		}
		
		A = B;
		B = null;
		
		System.out.println("\nReversed array is ");
		for(int x : A) {
			System.out.print(x+" ");
		}
	}
	
	public int reverse(int n) {
		
		int ans = 0;
		
		while(n!=0) {
			int digit = n % 10;
			ans = ans * 10 + digit;
			n = n / 10;
		}
		
		return ans;	
	}
	
	public boolean validate(String name) {
		
		if(name.matches("[a-zA-Z]+")) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean validate(int age) {
		if(age>=6 && age<=17) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		OverloadValidateMethod ovm = new OverloadValidateMethod();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of rectangle");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter radius of circle");
		double radius = sc.nextDouble();
		System.out.println("Area of circle is " + ovm.area(radius));
		System.out.println("Area of rectangle is " + ovm.area(l,b));
			
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		System.out.println("Reversed n is "+ ovm.reverse(n));
		ovm.reverse(new int[]{68,33,6,3,12,56,90,36});
		
		System.out.println("Enter the name ");
		String name = sc.next();
		System.out.println(name);
		System.out.println("Name is valid: "+ ovm.validate(name));
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		System.out.println("Valid age for school: "+ ovm.validate(age));
	}
}
