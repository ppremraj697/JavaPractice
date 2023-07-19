package studentChallenges;
import java.util.Scanner;

public class TypeOfWebsite {
	
	public void dayInWords() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day number ");
		int day = sc.nextInt();
		
		if(day==1) {
			System.out.println("It's Monday");
		}
		else if(day==2) {
			System.out.println("It's Tuesday");
		}
		else if(day==3) {
			System.out.println("It's Wednesday");
		}
		else if(day==4) {
			System.out.println("It's Thursday");
		}
		else if(day==5) {
			System.out.println("It's Friday");
		}
		else if(day==6) {
			System.out.println("It's Saturday");
		}
		else if(day==7) {
			System.out.println("It's Sunday");
		}
		else {
			System.out.println("Not a valid day");
		}
	}
	
	public void typeOfWebsite() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter URL ");
		
		String url = new String();
		url = sc.nextLine();
		
		int colonIndex = url.indexOf(":");
		int fullStop = url.lastIndexOf(".");
		
		String protocol = url.substring(0,colonIndex);
		String type = url.substring(fullStop+1);
		
		System.out.println(protocol);
		System.out.println(type);
		
		if(protocol.equals("http")) {
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("https")) {
			System.out.println("Secured Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("File Transfer Protocol");
		}
		
		if(type.equals("com")) {
			System.out.println("Commercial Website");
		}
		else if(type.equals("org")) {
			System.out.println("Organizational Website");
		}
		else if(type.equals("net")) {
			System.out.println("Network Website");
		}
	}

	public static void main(String[] args) {
		
		TypeOfWebsite tow = new TypeOfWebsite();
		
		tow.dayInWords();
		tow.typeOfWebsite();
	}
}
