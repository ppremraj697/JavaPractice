package studentChallenges;
import java.util.Scanner;

public class Factorial {
	
	public void multiplicationTable() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	
	public void sumNatural() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("Sum is " + sum);
	}
	
	public void factorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is " + fact);
		
	}

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		fact.multiplicationTable();
		fact.sumNatural();
		fact.factorial();

	}

}
