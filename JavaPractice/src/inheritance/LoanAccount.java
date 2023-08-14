package inheritance;

class LoanAccount extends Account{

	int loanAmount = 0;
	int lendedMoney = 0;
	float interest = 0;
	
	LoanAccount(){
		System.out.println("Calling LoanAccount()...");
	}
	
	void setLoanAmount(int amount) {
		this.loanAmount = amount;
		this.lendedMoney = amount;
	}
	void setInterest(int loanAmount) {
		if(loanAmount>100000) {
			this.interest = 4;
		}
		else if(loanAmount>500000) {
			this.interest = 7;
		}
		else {
			this.interest = 10;
		}
	}
	
	void payEMI() {
		lendedMoney -= 0.7*lendedMoney;
	}
	void repayment() {
		lendedMoney = 0;
	}
	
	public String toString() {
		return "Loan Amount: "+loanAmount+"\nLoan Interest: "+interest+"\nPending Amount: "+lendedMoney;
	}
}
