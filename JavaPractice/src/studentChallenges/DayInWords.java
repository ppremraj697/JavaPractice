package studentChallenges;
import java.util.Scanner;


public class DayInWords {
	
	public void dayInWords() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day number ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");		
				break;
		case 5: System.out.println("Friday");		
				break;
		case 6: System.out.println("Saturday");		
				break;
		case 7: System.out.println("Sunday");
				break;
		default:System.out.println("Invalid day number");
				break;//Optional but good practice
		}
	}
	
	public void monthInWords() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month number ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: System.out.println("January");
				break;
		case 2: System.out.println("February");
				break;
		case 3: System.out.println("March");
				break;
		case 4: System.out.println("April");
				break;
		case 5: System.out.println("May");
				break;		
		case 6: System.out.println("June");
		 		break;
		case 7: System.out.println("July");
				break;
		case 8: System.out.println("August");
				break;
		case 9: System.out.println("September");
				break;
		case 10: System.out.println("October");
				break;
		case 11: System.out.println("November");
				break;
		case 12: System.out.println("December");
				break;	
		default: System.out.println("Not a valid month number");
				break;
		}
	}
	
	public void typeOfWebsite() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter URL ");
		
		String domain = new String();
		domain = sc.nextLine();//google.coom format
		
		int fullStop = domain.lastIndexOf(".");
		
		String type = domain.substring(fullStop+1);
		
		switch(type) {
		case "com": System.out.println("Commercial");
					break;
		case "gov": System.out.println("Government");
					break;
		case "net": System.out.println("Network");
					break;
		case "org": System.out.println("Organizational");
					break;
		}
		
	}

	public static void main(String[] args) {
		
		DayInWords diw = new DayInWords();
		diw.dayInWords();
		diw.monthInWords();
		diw.typeOfWebsite();
	}

}
