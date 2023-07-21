package studentChallenges;
import java.util.Scanner;

public class Fibonacci {
	
	public void ap() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Term, Common Difference and Nnumber of Terms of Arithmetic Progression to be displayed");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(a+ ", ");
			a = a + d;
		}
	}

	public void gp() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Term, Common Ratio and Nnumber of Terms of Geometric Progression to be displayed");
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(a+ ", ");
			a = a * r;
		}
	}
	
	public void fibonacci() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms in fibonacci series to be printed");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1; 
		
		
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(a+", "+b);
		}
		else if(n>2){
			System.out.print(a+", "+b+", ");
		}
		
		for(int i = 2; i < n; i++) {
			int nextFib = a + b;
			System.out.print(nextFib+", ");
			a = b;
			b = nextFib;
		}
	}
	
	public static void main(String[] args) {
		
		Fibonacci fb = new Fibonacci();
//		fb.ap();
//		fb.gp();
		fb.fibonacci();
	}

}
