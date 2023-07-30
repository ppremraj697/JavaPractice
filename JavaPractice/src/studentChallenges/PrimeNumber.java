package studentChallenges;
import java.util.Scanner;

public class PrimeNumber {
	
	public boolean isPrime() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public int gcd(int m, int n) {
		
		while(m!=n) {
			if(m>n) {
				m = m - n;
			}
			else {
				n = n - m;
			}
		}
		
		return m;
	}
	
	public int maxElement(int A[]) {
		//No duplicates is the array
		
		int maxElement = Integer.MIN_VALUE;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]>maxElement) {
				maxElement = A[i];
			}
		}
		
		return maxElement;
	}

	public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		//PRIME NUMBER
		boolean ans = pn.isPrime();
		if(ans) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}
		
		//GCD
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers for GCD");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int ans2 = pn.gcd(p,q);
		System.out.println("GCD of "+p+" and "+q+" is "+ans2);
		
		//MAX ELEMENT IN THE ARRAY
		int arr[] = new int[10];
		System.out.println("Enter elements of the array ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans3 = pn.maxElement(arr);
		System.out.println("Maximum element in the array is "+ans3);
	}
}
