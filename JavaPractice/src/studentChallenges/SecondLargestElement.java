package studentChallenges;
import java.util.Scanner;

public class SecondLargestElement {
	
	public void sumOfElements() {
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		
		for(int i : A) {
			sum+=i;
		}
		
		System.out.println("Sum of the elements of the array is " + sum);
	}
	
	public void searchElement() {
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search in array");
		int search = sc.nextInt();
		boolean found = false;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]==search) {
				System.out.println("Element is found at "+i+"th index ");
				found = true;
//				System.exit(0);//exits the whole program, can't execute other methods 
			}
		}
		
//		System.out.println("Element is not present in the array ");
		
		if(!found) {
			System.out.println("Element is not present in the array");
		}
	}
	
	public void maxElement() {
		//No duplicates is the array
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		
		int maxElement = Integer.MIN_VALUE;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]>maxElement) {
				maxElement = A[i];
			}
		}
		System.out.println("Maximum element in the array is "+ maxElement);
	}
	
	public void secondLargestElement() {
		int A[] = {3,9,7,8,18,6,15,5,4,10};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]>max) {
				secondMax = max;
				max = A[i];
			}
			if(A[i]<max && A[i]>secondMax) {
				secondMax = A[i];
			}
		}
		System.out.println("Largest element is " + max);
		System.out.println("Second largest element in the array is " + secondMax);
	}

	public static void main(String[] args) {
		
		SecondLargestElement sle = new SecondLargestElement();
//		sle.sumOfElements();
		sle.searchElement();
		sle.maxElement();
//		sle.secondLargestElement();
		

	}

}
