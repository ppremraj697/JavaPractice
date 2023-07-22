package apnaCollege;
import java.util.Scanner;

public class AdvancedPatterns {
	
	public static void HollowButterfly(int n) {
		//Upper half
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if(j==1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				if(i==j || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Lower half
		for(int i = n; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				if(j==1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				if(i==j || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void Parallelogram(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
	}
	
	public static void Diamond(int n) {
		//Upper Half
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j < 2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower Half
		for(int i = 1; i <= n - 1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 2*n - 1; j > 2*i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		//Lower Half2
//		for(int i = n; i >= 0; i--) {
//			for(int j = n; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j < 2*i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	public static void NumberPyramid(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		HollowButterfly(n);
		Parallelogram(n);
		Diamond(n);
		NumberPyramid(n);

	}

}
