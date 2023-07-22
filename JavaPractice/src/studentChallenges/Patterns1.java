package studentChallenges;
import java.util.Scanner;

public class Patterns1 {
	
	public void pattern1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public void pattern3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int p = i;
			for(int j = 1; j <= n; j++) {
				System.out.print(p+1+" ");//i+j
				p++;
			}
			System.out.println();
		}
	}
	
	public void pattern4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		int count = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.format("%02d ",count);
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Patterns1 p1 = new Patterns1();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
		p1.pattern4();
	}

}
