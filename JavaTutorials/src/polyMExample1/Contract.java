package polyMExample1;

public class Contract extends Employee {

	private double fee;

	public Contract(String name, double fee) {
		super(name);
		this.fee = fee;

	}

	@Override
	public double calcPay() {
		return fee + 100;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
