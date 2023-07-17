package stringPractice;

public class StringMethods {

	public static void main(String[] args) {
		String str = new String("         Premraj Patil    ");
		System.out.println(str);
		
		System.out.println(str.length());
		String str1 = new String(str.trim());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.substring(8));
		System.out.println(str1.substring(4,9));
		
		System.out.println(str1.replace('P', 'H'));
		
		System.out.println(str1.startsWith("Prem"));
		System.out.println(str1.startsWith("H"));
		System.out.println(str1.endsWith("Patil"));
		System.out.println(str1.endsWith("PAtil"));//Shows that inputs are case sensitive
		
		System.out.println(str1.charAt(8));
		
		System.out.println(str1.indexOf("P",4));//returns 1st occurrence of P after 4th index
		System.out.println(str1.indexOf("raj"));//returns 1st occurrence of raj
		System.out.println(str1.lastIndexOf("P"));
		System.out.println(str1.lastIndexOf("a",8));
		
		System.out.println(str1.valueOf(5));//Typecast to string type
		
		System.out.println(str1.contains("raj"));
		
		String str2 = new String(" is a Good Boy");
		System.out.println(str1.concat(str2));//Concatenation
		System.out.println(str1 + str2);
		
		
		

		


	}

}
