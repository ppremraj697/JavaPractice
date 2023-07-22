package studentChallenges;
import java.util.Scanner;

public class Patterns3 {
	
	public void pattern1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" "+" ");
			}
			for(int k = 1; k<=n-i+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" "+" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" "+" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			for(int l = 1; l < i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Patterns3 p1 = new Patterns3();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();

	}

}
