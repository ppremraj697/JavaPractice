package studentChallenges;

public class MatrixMultiplication {
	
	public void matrixAddition() {
		
		int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
		System.out.println("Matrix A is ");
		for(int x[] : A) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
		System.out.println("Matrix B is ");
		for(int p[] : B) {
			for(int q : p) {
				System.out.print(q+" ");
			}
			System.out.println();
		}
		
		int C[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("Addition Matrix C is ");
		for(int x[] : C) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void matrixMultiplication() {
		
		int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
		System.out.println("Matrix A is ");
		for(int x[] : A) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
		System.out.println("Matrix B is ");
		for(int p[] : B) {
			for(int q : p) {
				System.out.print(q+" ");
			}
			System.out.println();
		}
		
		int C[][] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					C[i][j] += A[i][k]*B[k][j]; 
				}
			}
		}
		
		System.out.println("Multiplication Matrix C is ");
		for(int x[] : C) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void sortArrayOfString() {
		
		String str[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
		System.out.println("Array of Strings before sorting is: \n");
		
		for(String s : str) {
			System.out.print(s+" ");
		}
		
//		java.util.Arrays.sort(str);//Built-in method
		
		//BUBBLE SORT
		for(int i = 0; i < str.length - 1; i++) {			
			for(int j = 0; j < str.length - i - 1; j++) {			
				if(str[j].compareTo(str[j+1]) > 0) {
					String temp = str[j];
					str[j] = str [j+1];
					str[j+1] = temp;
				}	
			}		
		}
		
		System.out.println("\n\nSorted Array of Strings is(Bubble sort): \n");
		for(String s : str) {
			System.out.print(s+" ");
		}
	}

	public static void main(String[] args) {
		
		MatrixMultiplication mm = new MatrixMultiplication();
		mm.matrixAddition();
		mm.matrixMultiplication();
		mm.sortArrayOfString();
	}
}
