package stringPractice;

public class StringConstructors {

	public static void main(String[] args) {
		//Ways to create String Object using built-in Constructor
		
		String str = new String();
		str = "Premraj";
		System.out.println(str);
		
		String str1 = new String("Java");
		System.out.println(str1);
		
		char ch[] = {'P','r','e','m','r','a','j'};
		String str2 = new String(ch);
		System.out.println(str2);
		
		String str3 = new String(ch,4,3);
		System.out.println(str3);
		
		int arr[] = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
		String str4 = new String(arr, 8,5);
		System.out.println(str4);
		
		byte b[] = {81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97};
		String str5 = new String(b,8,3);
		System.out.println(str5);
		//String str6 = new String(b,5);//DEPRECATED
		String str7 = new String(b);
		System.out.println(str7);
//		String str8 = new String(b, 5,3,4);//DEPRECATED
		
		StringBuffer sb = new StringBuffer("Patil");
		String str9 = new String(sb);
		System.out.println(str9);
	}

}
