package stringPractice;

public class StringComparision {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "java";
		String str4 = "ABC";
		
		String str5 = new String("Java");
		String str6 = new String("XYZ");
		String str7 = new String("XYZ");
		
		System.out.println(str1.equals(str2));//Compares content of String Object and is case sensitive
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str5));
		
		System.out.println(str1==str2);//Compares references
		System.out.println(str1==str3);
		System.out.println(str1==str5);
		
		System.out.println(str1.equalsIgnoreCase(str3));//Comparison ignoring the case of the String Object
		
		System.out.println(str1.compareTo(str2));//Returns difference between the ASCII code of the first mismatched character
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str1));
		System.out.println(str1.compareTo(str4));
		
	}

}
