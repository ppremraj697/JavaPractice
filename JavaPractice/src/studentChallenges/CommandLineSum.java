package studentChallenges;

public class CommandLineSum {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(int i = 0; i < args.length; i++) {
			if(args[i].matches("[0-9\\.]+")) {
				sum += Double.parseDouble(args[i]);
			}	
		}
		
		System.out.println("Sum of elements from command line is "+sum);
	}

}
