package inheritance;

class SavingAccount extends Account {
	
	int fdAmount=0;
	
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
		}
	}
}
