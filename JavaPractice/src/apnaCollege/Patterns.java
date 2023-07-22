package apnaCollege;
import java.util.Scanner;

public class Patterns {
	
	public static void Pattern1(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void Pattern2(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				int matrix = i+j;
				if(matrix % 2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	public static void Pattern3(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = i; k >= 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		
		Pattern1(n);
		Pattern2(n);
		Pattern3(n);

	}

}
