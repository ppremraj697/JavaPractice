package inheritance;

class SavingAccount extends Account {
	
	int fdAmount=0;
	
//	SavingAccount(){
//		System.out.println("Calling SavingAccount()...");
//	}
	
	SavingAccount(int accountNo, String name, String phone, String dob){
		super(accountNo, name, phone, dob);
		System.out.println("Calling SavingAccount(int accountNo, String name, String phone, String dob)...");
	}
	
	int getFdAmount() {
		return fdAmount;
	}
	
	void deposite(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		if(amount < balance-fdAmount) {
			balance -= amount;
		}
		else {
			System.out.println("Not sufficient balance");
		}		
	}
	void setFdAmount(int amount) {
		if(amount < balance) {
			fdAmount = amount;
			balance -= amount;
		}
		else {
			System.out.println("Enter amount exceeds the account balance");
		}
	}
	void liquidateFdAmount() {
		balance += fdAmount;
	}
	
	public String toString() {
		return "Name: "+name+"\nPhone No: "+phoneNo+"\nAccount No: "+accountNo;
	}
}
