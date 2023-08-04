package innerClass;

class Outer3{
	
	int x = 10;
	static int y = 20;
	
	void nonStaticOuterDisplay() {
		System.out.println("nonStaticOuterDisplay() Method");
	}
	
	static void staticOuterDisplay() {
		System.out.println("staticOuterDisplay() Method");
	}
	
	//ASSOCIATED WITH CLASS DIRECTLY RATHER THAN INSTANCE OF IT
	static class Inner3{
		
		public void display() {
			//CANNOT ACCESS x AND nonStaticOuterDisplay() AS THEY ARE NON-STATIC
			System.out.println("y is "+ y);
			staticOuterDisplay();
		}
	}
}

public class Main2 {

	public static void main(String[] args) {
		
		Outer3.Inner3 oi = new Outer3.Inner3();
		oi.display();		
	}

}
