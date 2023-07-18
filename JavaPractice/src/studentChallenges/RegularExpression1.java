package studentChallenges;
import java.util.Scanner;

public class RegularExpression1 {
	
	public void checkBinary() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether its binary or not");
		String str = sc.nextLine();
		
		if(str.matches("[01]+")) {
			System.out.println("Entered string is binary");
		}
		else {
			System.out.println("Entered string is non-binary");
		}
	}
	
	public void checkHexaDecimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether it contains Hexadecimal number or not");
		String str = sc.nextLine();
		
		if(str.matches("[0-9A-F]+")) {
			System.out.println("Entered string is Hexadecimal number");
		}
		else {
			System.out.println("Entered string is not Hexadecimal number");
		}
	}
	
	public void validDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether its valid Date or not");
		String str = sc.nextLine();
		
		if(str.matches("[0-3][1-9]/[0|1][1-9]/[0-9]{4}")) {
			System.out.println("Entered string is valid date format");
		}
		else {
			System.out.println("Entered string is not a valid date format");
		}
	}

	public static void main(String[] args) {
		
		RegularExpression1 obj1 = new RegularExpression1();
		obj1.checkBinary();
		obj1.checkHexaDecimal();
		obj1.validDate();
		
	}

}
