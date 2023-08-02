package innerClass;

class Outer1{
	
	int x = 10;
	static int y = 20;
	
	void nonStaticOuterDisplay() {
		System.out.println("nonStaticOuterDisplay() Method");
		System.out.println(x+" "+y);
		
		//This class can also be FINAL and ABSTRACT
		class MethodLocalInner{
			
			//This method can be STATIC also
			void display() {
				System.out.println("display() of class MethodLocalInner");
				System.out.println(x+" "+y);
			}
		}
		
		MethodLocalInner mli = new MethodLocalInner();
		mli.display();
	}
	
	static void staticOuterDisplay() {
		System.out.println("staticOuterDisplay() Method");
		System.out.println(y);	
		
		//This class can also be FINAL and ABSTRACT
		class MethodLocalInner1{
			
			//This method can be STATIC also
			void display() {
				System.out.println("display() of class MethodLocalInner1");
				System.out.println(y);
			}
		}
		
		//ANONYMOUS OBJECT
		new MethodLocalInner1().display();
	}
}

public class Main {

	public static void main(String[] args) {
		
		Outer1 o1 = new Outer1();
		o1.nonStaticOuterDisplay();
		Outer1.staticOuterDisplay();
	}

}
