package innerClass;

class Outer2{
	
	int x = 10;
	static int y = 20;
	
	void nonStaticOuterDisplay() {
		System.out.println("nonStaticOuterDisplay() Method");
		System.out.println(x+" "+y);
	}
	
	static void staticOuterDisplay() {
		System.out.println("staticOuterDisplay() Method");
		System.out.println(y);
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Outer2 o = new Outer2();
	}
}
