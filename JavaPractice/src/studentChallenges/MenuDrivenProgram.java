package studentChallenges;
import java.util.Scanner;

public class MenuDrivenProgram {
	
	public void arithmaticOperations() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Operations Availabel are: ");
		System.out.println("Add");
		System.out.println("Subtract");
		System.out.println("Multiplication");
		System.out.println("Division");
		
		System.out.println("Enter two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the operation to perform");
		String operation = new String();
		sc.nextLine();
		operation = sc.nextLine();
		
		switch(operation) {
		case "Add":System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
				   break;
					
		case "Subtract":System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
						break;
						
		case "Multiplication":System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
							  break;
								
		case "Division":System.out.println("Division of "+a+" and "+b+" is "+(a/b));
						break;
						
		default:System.out.println("Enter valid operation");
				break;
		}
	}

	public static void main(String[] args) {
		MenuDrivenProgram mdp = new MenuDrivenProgram();
		
		mdp.arithmaticOperations();

	}

}
