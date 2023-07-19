package studentChallenges;
import java.util.Scanner;

public class FindRadix {
	
	public void findRadix() {
		
		Scanner sc = new Scanner(System.in);
		
		String number = new String();
		System.out.println("Enter the number ");
		number = sc.next();
		
		if(number.matches("[01]+")) {
			System.out.println("Binary Number, Radix = 2");
		}
		else if(number.matches("[0-7]+")) {
			System.out.println("Octal Number, Radix = 8");
		}
		else if(number.matches("[0-9]+")) {
			System.out.println("Decimal Number, Radix = 10");
		}
		else if(number.matches("[0-9A-F]+")) {
			System.out.println("HexaDecimal Number, Radix = 16");
		}
		else {
			System.out.println("Not a number");
		}
	}
	
	public void isLeapYear() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year ");
		int year = sc.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println("It's a leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("It's a leap year");
			}
		}
		else {
			System.out.println("It's not a leap year");
		}
	}

	public static void main(String[] args) {
		
		FindRadix fr = new FindRadix();
//		fr.findRadix();
		fr.isLeapYear();
	}

}
