package inheritance;

class Account {

	int accountNo;
	String name;
	String address;
	String phoneNo;
	String dob;
	int balance;
	
	//GETTER
	int getAccountNo() {
		return accountNo;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	String getPhoneNo() {
		return phoneNo;
	}
	String getDOB() {
		return dob;
	}
	int getBalance() {
		return balance;
	}
	
	//SETTER
	void setPhoneNo(String phone) {
		this.phoneNo = phone;
	}
	void setAddress(String address) {
		this.address = address;
	}
	
	//EXTRA
	public void closeAccount() {
		System.out.println("Closing Account...");
	}
	
	//CONSTRUCTOR
	Account(){}
	
	Account(int accountNo, String name, String phone, String dob){
		this.accountNo = accountNo;
		this.name = name;
		this.phoneNo = phone;
		this.dob = dob;
		this.balance = 500;
	}	
}
