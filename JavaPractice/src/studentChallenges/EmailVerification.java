package studentChallenges;

public class EmailVerification {

	public static void main(String[] args) {
		
		String str = new String("ppremraj697@gmail.com");
		
		int index= str.indexOf("@");
		
		String userName = str.substring(0,index);
		String domain = str.substring(index+1);
		
		System.out.println("User name is " + userName);
		System.out.println("Domain is " + domain);
		
		int i = domain.indexOf(".");
		
		String str1 = domain.substring(0,i);
		
		if(str1.equals("gmail")) {
			System.out.println("This email-id is on Gmail");
		}
		else {
			System.out.println("This email-id is not on Gmail");
		}
	}
}
