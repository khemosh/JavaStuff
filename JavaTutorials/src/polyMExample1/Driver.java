package polyMExample1;

public class Driver {

	public static void main(String[] args) {
		
		Employee jim = new Fulltime("Jim", 500);
		Employee bob = new PartTime("Bob", 10, 49);
		Employee frank = new Contract("Frank", 1000);
		

		displayPay(jim);
		displayPay(bob);
		displayPay(frank);
		// this method accepts a parameter of type Employee, so it can take any of the employees..
		
	}
	

	public static void displayPay(Employee e){
		System.out.println(e.getName() + "'s" + " pay this week is: " + e.calcPay());
	}

}
