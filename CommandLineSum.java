import java.lang.Double;

public class CommandLineSum{

	public static void main(String args[]){
	
		double sum = 0;

		for(int i = 0; i < args.length; i++){
			sum += Double.parseDouble(args[i]);
		}

		System.out.println("Sum of command line arguments is "+ sum);
	}
}