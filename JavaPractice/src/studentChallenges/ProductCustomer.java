package studentChallenges;

class Product{
	private String itemNo;
	private String name;
	private int price;
	private int qty;
	
	public String getItemNo() {
		return itemNo;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	Product(String itemNo, String name){
		System.out.println("\nCalling Parameterized Constructor with ItemNo and Name...");
		this.itemNo = itemNo;
		this.name = name;
	}
	Product(String itemNo, String name,int price, int qty){
		System.out.println("\nCalling Parameterized Constructor with itemNo, Name, Price and Quantity...");
		this.itemNo = itemNo;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
}

class Customer{
	private String custId;
	private String name;
	private String address;
	private String phNo;
	
	public String getCustId() {
		return custId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhNo() {
		return phNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	Customer(String custId, String name){
		System.out.println("\nCalling Parameterized Constructor with CustId and Name...");
		this.custId = custId;
		this.name = name;
	}
	Customer(String custId, String name, String address, String phNo){
		System.out.println("\nCalling Parameterized Constructor with CustId, Name, Address and PhoneNo...");
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}
}

public class ProductCustomer {

	public static void main(String[] args) {
		
		Product p = new Product("P-75", "Ambari Masala");
		p.setPrice(200);
		p.setQty(25);
		System.out.println("ItemNo is "+ p.getItemNo());
		System.out.println("Name of the product is: "+p.getName());
		System.out.println("Price of the Product is: "+p.getPrice());
		System.out.println("Quantity of product is: "+p.getQty());
		
		Product p1 = new Product("P-76", "KitchenKing Masala", 150, 20);
//		p.setPrice(150);
//		p.setQty(20);
		System.out.println("ItemNo is "+ p1.getItemNo());
		System.out.println("Name of the product is: "+p1.getName());
		System.out.println("Price of the Product is: "+p1.getPrice());
		System.out.println("Quantity of product is: "+p1.getQty());
		
		Customer c = new Customer("C-101", "Premraj");
		c.setAddress("Pune");
		c.setPhNo("+91 9119216014");
		System.out.println("Customer Id is: "+ c.getCustId());
		System.out.println("Customer name is: "+c.getName());
		System.out.println("Customer Address is: "+c.getAddress());
		System.out.println("Customer Contact is: "+c.getPhNo());
		
		Customer c1 = new Customer("C-102", "Aman", "Chinchwad", "+91 9119254014");
//		c.setAddress("Chinchwad");
//		c.setPhNo("+91 9119254014");
		System.out.println("Customer Id is: "+ c1.getCustId());
		System.out.println("Customer name is: "+c1.getName());
		System.out.println("Customer Address is: "+c1.getAddress());
		System.out.println("Customer Contact is: "+c1.getPhNo());
	}

}
