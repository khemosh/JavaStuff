package polyMExample1;

public class PartTime extends Employee {

	private double rate;
	private int hours;

	public PartTime(String name, double rate, int hours) {
		super(name);
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public double calcPay() {
		return rate * hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
