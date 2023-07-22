package studentChallenges;

import java.util.Scanner;

public class Patterns2 {
	
	public void pattern1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		int count = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	
	public void pattern3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int p = 1;
			for(int j = n; j >= i; j--) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Patterns2 p1 = new Patterns2();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
	}

}
