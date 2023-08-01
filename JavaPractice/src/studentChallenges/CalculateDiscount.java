package studentChallenges;

public class CalculateDiscount {
	
	public int max(int...A) {
		
		int m = Integer.MIN_VALUE;
		
		if(A.length==0) {
			return m;
		}
		
		for(int i = 0; i < A.length; i++) {
			if(A[i]>m) {
				m = A[i];
			}
		}
		
		return m;
	}
	
	public int sum(int...A) {
		
		int sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		return sum;
	}
	
	public double discount(double...Bill) {
		
		int sum = 0;
		
		for(int i = 0; i < Bill.length; i++) {
			sum += Bill[i];
		}
		
		
		if(sum<100) {
			return 0.0;
		}
		else if(sum<500 && sum>100) {
			return 5.0;
		}
		else if(sum<1000) {
			return 10.0;
		}
		else {
			return 20;
		}		
	}

	public static void main(String[] args) {
		
		CalculateDiscount cd = new CalculateDiscount();
		
		System.out.println("Maximum is " + cd.max(2,456,3,44,30,345,50,59,3,78,25));
		System.out.println("Maximum is " + cd.max());
		
		System.out.println("Sum is " + cd.sum(2,456,3,44,30,345,50,59,3,78,25));
		System.out.println("Sum is " + cd.sum());
		
		System.out.println("Discount is "+ cd.discount(34,6,34345)+"%");
		System.out.println("Discount is "+ cd.discount()+"%");
		
	}

}
