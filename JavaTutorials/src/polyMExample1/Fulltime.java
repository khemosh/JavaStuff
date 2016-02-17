package polyMExample1;

public class Fulltime extends Employee {

	private double salary;

	public Fulltime(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public double calcPay() {
		return salary;
	}

}
