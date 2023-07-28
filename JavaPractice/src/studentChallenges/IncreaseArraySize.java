package studentChallenges;

public class IncreaseArraySize {
	
	public void copyArray() {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		
		int B[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		System.out.println("Elements in array B are (Array A)");
		
		for(int x : B) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}
	
	public void copyReverseArray() {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		
		int B[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			B[A.length-i-1] = A[i];
		}
		
		System.out.println("Elements in array B are (Reversed Array A)");
		
		for(int x : B) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}
	
	public void increaseLength() {
		
		int A[] = {1,3,5,7,9};
		
		System.out.println("Size of A is " + A.length);
		
		int B[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		A = B;
		B = null;
		
		System.out.println("New size of A is " + A.length);
	}

	public static void main(String[] args) {
		
		IncreaseArraySize ias = new IncreaseArraySize();
		ias.copyArray();
		ias.copyReverseArray();
		ias.increaseLength();
	}
}
