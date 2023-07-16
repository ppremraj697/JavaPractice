package studentChallenges;
import java.util.Scanner;

public class BitManipulation {
	
	public void swap() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of a and b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Numbers before swapping are a = "+a+" and b = "+b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("Numbers after swapping are a = "+a+" and b = "+b);
	}
	
	public void inNibble() {
		//Storing 2 numbers within a single byte in 4 bits each
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of a and b ");
		
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		byte c = 0;
		
		c = (byte) (c | a);
		b = (byte)(b << 4);
		c = (byte) (c | b);
		
		System.out.println("Binary representation of c is " + String.format("%8s", Integer.toBinaryString(c)));
		System.out.println("Binary representation of c is " + Integer.toBinaryString(c));
		
		System.out.println("Number in first four bits of c are " + ((c&0b11110000)>>4));
		System.out.println("Number in last four bits of c are " + (c&0b00001111));
	}

	public static void main(String[] args) {
		
		BitManipulation bt = new BitManipulation();
		bt.swap();
		bt.inNibble();
	}

}
