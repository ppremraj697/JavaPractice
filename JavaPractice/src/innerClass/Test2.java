package innerClass;

interface AnoInterface{
	
	void iDisplay();	
}

class Outer2{
	
	int x = 10;
	static int y = 20;
	
	//THIS CAN BE INSIDE METHOD SCOPE ALSO
	//IF INSIDE METHOD THEN METHOD-LOCAL VARIABLE MUST BE EFFECTIVELY FINAL FOR ANONYMOUS INNER CLASS
	//IF DIRECTLY IN CLASS THEN CAN UPDATE CLASS VARIABLE 
	AnoInterface ai = new AnoInterface() {
		
		public void iDisplay() {
			System.out.println("Implementing interface as Anonymous Inner Class");
		}
	};
	
	void nonStaticOuterDisplay() {
		System.out.println("nonStaticOuterDisplay() Method");
		System.out.println(x+" "+y);	
		ai.iDisplay();
	}
	
	static void staticOuterDisplay() {
		System.out.println("staticOuterDisplay() Method");
		System.out.println(y);
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Outer2 o = new Outer2();
		o.nonStaticOuterDisplay();
		
		AnoInterface ai2 = new AnoInterface() {
			public void iDisplay() {
				System.out.println("Implementing interface inside main method");
			}
		};
		
		ai2.iDisplay();
	}
}
