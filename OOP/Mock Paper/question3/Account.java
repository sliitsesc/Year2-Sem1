package question3;



public class Account {

	int Account_No;
	double balance;
	
	public Account(int i) {
		this.Account_No = i;
	}

	public void deposit(double d) {
		this.balance += d; 
		
	}

	public void withdraw(double d) throws InsuffientBalanceException {
		
		if(balance < d) {
			throw new InsuffientBalanceException(balance);
		}
		else {
			this.balance -= d;
		}
	}
	
	public void display() {
		System.out.println("Existing Amount = " +this.balance);
	}

}
