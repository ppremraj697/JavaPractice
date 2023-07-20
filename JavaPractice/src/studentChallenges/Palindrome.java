package studentChallenges;
import java.util.Scanner;

public class Palindrome {
	
	public void reverseNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		int sum = 0;
		int m = n;
		
		while(n > 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		
		System.out.println("Reversed number is " + sum);
		
		//if a number is palindrome
		if(sum == m) {
			System.out.println("Entered number is palindrome");
		}
		else {
			System.out.println("Entered number is not palindrome");
		}
	}

	public static void main(String[] args) {
		
		Palindrome pd = new Palindrome();
		pd.reverseNumber();
	}

}
