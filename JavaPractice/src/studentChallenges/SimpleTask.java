package studentChallenges;
import java.util.Scanner;

public class SimpleTask {
	
	public void isEven() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	
	public void isYoung() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		
		if(age>=14 && age<=55) {
			System.out.println("The person is young");
		}
		else {
			System.out.println("The person is not young");
		}
	}
	
	public void grade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of Physics, Chemistry, Maths ");
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int maths = sc.nextInt();
		
		int avg = (physics+chemistry+maths)/3;
		
		if(avg>70) {
			System.out.println("Grade is A");
		}
		else if(avg>60 && avg<=70) {
			System.out.println("Grade is B");
		}
		else if(avg>50 && avg<=60) {
			System.out.println("Grade is C");
		}
		else if(avg>40 && avg<=50) {
			System.out.println("Grade is D");
		}
		else {
			System.out.println("Grade is F");
		}
	}

	public static void main(String[] args) {
		
		SimpleTask st = new SimpleTask();
//		st.isEven();
//		st.isYoung();
		st.grade();

	}

}
