package question3;

public class InsuffientBalanceException extends Exception {
	double amount;
	
	InsuffientBalanceException(double d){
		this.amount = d;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
