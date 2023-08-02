package innerClass;

//import innerClass.Outer.Inner; //option for line 53 without Outer class reference

class Outer{
	
	int x = 10;
	static int y = 20;
	
	void nonStaticOuterDisplay() {
		System.out.println("nonStaticOuterDisplay() Method");
	}
	
	static void staticOuterDisplay() {
		System.out.println("staticOuterDisplay() Method");
	}
	
	//OBJECT OF INNER CLASS BEFORE HAND
	Inner i = new Inner();
	
	//INNER CLASS
	class Inner{
		
		void nonStaticInnerDisplay() {
			System.out.println("Inside nonStaticInnerDisplay() of class Inner " + x + " " + y);
			nonStaticOuterDisplay();
			staticOuterDisplay();
		}
		
		static void staticInnerDisplay() {
		//cannot access x and nonStaticOuterDisplay() as it is static method or they are non-static
			System.out.println("Inside staticInnerDisplay() of class Inner " + y);
			staticOuterDisplay();
		}		
	}
}

public class Test {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		o.nonStaticOuterDisplay();
		System.out.println(o.x);
		Outer.staticOuterDisplay();
		System.out.println(Outer.y);
		
		Outer.Inner oi1 = new Outer().new Inner();
//		Outer.Inner oi2 = o.new Inner();
		
		oi1.nonStaticInnerDisplay();
		Outer.Inner.staticInnerDisplay();
	}

}
