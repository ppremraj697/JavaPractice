package studentChallenges;
import java.util.Scanner;

public class RegularExpression2 {
	
	public void removeSpecialCharacters(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		
		String str1 = str.replaceAll("[^a-z0-9A-Z]*", "");
		
		System.out.println("String without special characters is " + str1);
	}
	
	public void removeExtraSpacesCountWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		
		String str1 = str.replaceAll("[\\s]+", " ").trim();
		
		System.out.println("String without extra spaces is " + str1);
		
		String str2[] = str1.split("\\s");
		
		System.out.println("Number of words in the  string are " + str2.length);
	}

	public static void main(String[] args) {
		
		RegularExpression2 obj1 = new RegularExpression2();
		obj1.removeExtraSpacesCountWords();
		
	}

}
