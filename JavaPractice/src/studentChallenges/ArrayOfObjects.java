package studentChallenges;

class Subjects{
	
	private String subId;
	private String subName;
	private int maxMarks;
	private int marksObtained;
	
	public String getSubId() {
		return subId;
	}
	public String getSubName() {
		return subName;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	public boolean isQualified(int marksObtained) {
		return (marksObtained/this.maxMarks) >= this.maxMarks*0.4;
	}
	
	public String toString()
	{
		return "\nSubject ID: "+subId+"\nSubject Name: "+subName+"\nMarks Obtained: "+marksObtained+"\n";
	}
	
	Subjects(String subId, String subName, int maxMarks){
		this.subId = subId;
		this.subName = subName;
		this.maxMarks = maxMarks;
	}
}

class Student0{
	
	private int rollNo;
	private String studName;
	private String deptName;
	private String[] subsName;
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return studName;
	}
	public String getDeptName() {
		return deptName;
	}
	public String[] getSubsName() {
		System.out.println("123");
		return subsName;
	}
	
	//VARIABLE ARGUMENT DEMONSTRATION
	public void setSubsName(String...subs) {
		this.subsName = new String[subs.length];
		
		for(int i = 0; i < subs.length; i++) {
			subsName[i] = subs[i];
		}
	}
	
	//CONSTRUCTOR
	Student0(String name, int roll, String dept){
		this.studName = name;
		this.rollNo = roll;
		this.deptName = dept;
	}
	
	public String toString() {
		return "\nName: "+studName+"\nRollNo: "+rollNo+"\nDepartment: "+deptName+"\n";
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Subjects sub[] = new Subjects[3];
		sub[0] = new Subjects("S-101", "DBMS", 100);
		sub[0].setMarksObtained(75);
		sub[1] = new Subjects("S-102", "OS", 70);
		sub[1].setMarksObtained(50);
		sub[2] = new Subjects("S-103", "CNS", 100);
		sub[2].setMarksObtained(75);
		
		for(Subjects s: sub ) {
			System.out.println(s);
		}
		
		

		Student0 stud[] = new Student0[3];
		
		//1st OBJECT
		stud[0] = new Student0("Aniket", 20144, "Comp");
		stud[0].setSubsName("Math", "Physics", "Chemistry");		
		String stud0[] = stud[0].getSubsName();	
		
		for(String s: stud0 ) {
			System.out.print(s+" ");
		}		
		
		System.out.println();
		
		//2nd OBJECT
		stud[1] = new Student0("Aman", 19267, "Mech");		
		stud[1].setSubsName();
		String stud1[] = stud[1].getSubsName();
		
		for(String s: stud1) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		//3rd OBJECT
		stud[2] = new Student0("Durgesh", 21153, "AI&DS");
		
		//PRINTING ALL OBJECTS USING toString() method
		for(Student0 s: stud) {
			System.out.println(s);
		}
	}

}
