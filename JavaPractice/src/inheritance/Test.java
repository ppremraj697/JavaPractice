package inheritance;
//import inheritance.Account;
//import inheritance.SavingAccount;
//import inheritance.LoanAccount;

public class Test {

	public static void main(String[] args) {
		
		SavingAccount acc = new SavingAccount(456712, "Premraj", "9119216013", "31/10/2001" );
		System.out.println("Account No: "+acc.getAccountNo());
		System.out.println("Name: "+acc.getName());
		acc.setAddress("Pune");
		System.out.println("Address: "+acc.getAddress());
		System.out.println("Phone No: "+acc.getPhoneNo());
		System.out.println("DOB: "+acc.getDOB());
		System.out.println("Balance: "+acc.getBalance());
		
		System.out.println("\nPrinting acc using toString() method...");
		System.out.println(acc);
		System.out.println();
		
		LoanAccount acc1 = new LoanAccount();
//		System.out.println(acc1);

	}

}
