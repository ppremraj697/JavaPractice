package studentChallenges;
import java.util.Scanner;

class Student1{
	
	int rollNo;
	String name;
	String course;
	int m1,m2,m3;
	
	public int total() {
		return m1+m2+m3;
	}
	
	public float average() {
		return total()/3f;
	}
	
	public void grade() {
		if(average()>70) {
			System.out.println("Grade is A");
		}
		else if(average()>60 && average()<=70) {
			System.out.println("Grade is B");
		}
		else if(average()>50 && average()<=60) {
			System.out.println("Grade is C");
		}
		else if(average()>40 && average()<=50) {
			System.out.println("Grade is D");
		}
		else {
			System.out.println("Grade is F");
		}
	}
	
	public void display() {
		System.out.println("\nDetails of the "+ name+ " are as follow: ");
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+ rollNo);
		System.out.println("Course enrolled: "+ course);
		System.out.println("Marks scored are: "+m1+" "+m2+" "+m3);
		System.out.println("Total Marks: "+total());
		System.out.println("Average Marks: "+average());
		grade();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student1 st = new Student1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number");
		st.rollNo = sc.nextInt();
		
		String temp = sc.nextLine();
		
		System.out.println("Enter Name");
		st.name = sc.nextLine();
		
		System.out.println("Enter Course");
		st.course = sc.nextLine();
		
		System.out.println("Enter marks for m1, m2 and m3 respectively");
		st.m1 = sc.nextInt();
		st.m2 = sc.nextInt();
		st.m3 = sc.nextInt();
		
		st.display();		
	}

}
