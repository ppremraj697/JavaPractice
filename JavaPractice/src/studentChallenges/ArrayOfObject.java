package studentChallenges;


class Student{
	private int rollNo;
	private String name;
	private String dept;
	private String[] subjects;
	
	//GETTERS
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String[] getSubjects() {
		return subjects;
	}
	
	//SETTERS
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSubjects(String... sub) {
		subjects = sub;
	}
	
	//CONSTRUCTOR
	public Student(int roll, String name, String dept, String... sub) {
		rollNo =roll;
		this.name = name;
		this.dept = dept;
		subjects = sub;
	}
	
	public String toString() {

		return "\nRollNo: "+rollNo+"\nName: "+name+"\nDept: "+dept+"\n";
	}
	
}

class Subject{
	private String subId;
	private String subName;
	private int maxMarks;
	private int obtainedMarks;
	
	//GETTERS
	public String getSubId() {
		return subId;
	}
	public String getSubName() {
		return subName;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public int getObtainedMarks() {
		return obtainedMarks;
	}
	
	//SETTERS
	public void setMaxMarks(int max) {
		maxMarks = max;
	}
	public void setObtainedMarks(int marks) {
		obtainedMarks = marks;
	}
	
	//CONSTRUCTOR
	public Subject(String sId, String sName, int max) {
		subId = sId;
		subName = sName;
		maxMarks = max;
	}
	
	//METHODS
	public boolean isQualified() {
		return obtainedMarks >= maxMarks*0.4;
	}
	
	//Overloading toString() method of OBJECT CLASS
	public String toString() {
		return "SubjectId: "+subId+"\nSubjectName: "+subName+"\nMarksObtained: "+obtainedMarks+"\n";
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("s101", "DSA", 100);
		subs[1] = new Subject("s102", "Java", 100);
		subs[2] = new Subject("s103", "OS", 100);
		
		for(Subject s : subs) {
			System.out.println(s);
		}
		
		Student stud[] = new Student[3];
		stud[0] = new Student(101, "Premraj", "CSE", "DSA","Java","TOC" );
		stud[1] = new Student(201, "Mahesh", "MECH", "Mechanics");
		stud[2] = new Student(202, "Kalpesh", "MECH");
		
		for(Student st : stud) {
			System.out.println(st);
		}
		
	}

}
