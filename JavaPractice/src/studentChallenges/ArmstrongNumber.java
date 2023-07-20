package studentChallenges;
import java.util.Scanner;

public class ArmstrongNumber {
	
	public void digitsInNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		int count = 0;
		
		while(n>0) {
			int rem = n % 10;
			n = n /10;
			count++;
			System.out.println(rem);
		}
		System.out.println("Number of digits is " + count);
	}
	
	public void isArmstrongNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		int m = n;
		int sum = 0;
		
		while(m>0) {
			
			int rem = m % 10;
			sum = sum + rem * rem * rem;
			m = m / 10;
		}
		
		if(n==sum) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not Armstrong Number");
		}
		
	}

	public static void main(String[] args) {
		
		ArmstrongNumber an = new ArmstrongNumber();
		an.digitsInNum();
		an.isArmstrongNumber();

	}

}
