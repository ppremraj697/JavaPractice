package studentChallenges;
import java.util.Scanner;

public class RotationOfArray {
	
	public void rotateArray() {
		int arr[] = {5,9,6,10,12,7,3,5,4,2};
		int first = arr[0];
		int last = arr[arr.length-1];
		
		//LEFT ROTATION BY ONE PLACE
		System.out.println("Array before left rotation");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
		
		System.out.println("\nArray after right rotation");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		//RIGHT ROTATION BY ONE PLACE
		System.out.println("\nArray1 before right rotation");
		int arr1[] = {5,9,6,10,12,7,3,5,4,2};
		for(int x : arr1) {
			System.out.print(x+" ");
		}
		
		for(int i = 1; i < arr1.length; i++) {
			arr1[arr1.length-i] = arr1[arr1.length-i-1];
		}
		arr1[0] = last;
		
		System.out.println("\nArray1 after right rotation is");
		for(int x : arr1) {
			System.out.print(x+" ");
		}
	}
	
	public void insertElement() {
		int arr[] = {5,9,6,10,12,7,3,5,4,2,0};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter element to be inserted ");
		int element = sc.nextInt();
		System.out.println("Enter index where to insert ");
		int index = sc.nextInt();
		
		System.out.println("Array before insertion is ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		int count = 1;
		for(int i = index; i < arr.length-1; i++) {
			arr[arr.length-count] = arr[arr.length-count-1];
			count++;
		}
		arr[index] = element;
		
		System.out.println("\nArray after insertion is ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	public void deleteElement() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter index from where we have to delete element");
		int index = sc.nextInt();
		
		int arr[] = {5,9,6,10,12,7,3,5,4,2};
		
		System.out.println("Array before deletion is ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		for(int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		if(index<arr.length) {
			arr[arr.length-1] = 0;
		}
		
		
		System.out.println("\nArray after deletion is ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) {
		
		RotationOfArray roa = new RotationOfArray();
		roa.rotateArray();
		roa.insertElement();
		roa.deleteElement();

	}

}
