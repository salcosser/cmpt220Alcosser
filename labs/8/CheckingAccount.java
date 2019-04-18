//Sam Alcosser
//4/17/19

//simple subclass of account that puts an overdraft limit on the account
public class CheckingAccount extends Account {
	final static double OVERDRAFT_LIMIT = 5000;
	//creating the superlcass object
	CheckingAccount(){
		super();
	}
	CheckingAccount(int id, double balance){
		super(id, balance);
	}
	//capping all payments at $5000 dollars
	@Override
	 void withdraw(double cost) {
		if (cost - OVERDRAFT_LIMIT <= this.getBalance()) {
			super.withdraw(cost);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "CheckingAccount [getMonthlyInterestRate()=" + getMonthlyInterestRate() + ", getMonthlyInterest()="
				+ getMonthlyInterest() + ", getId()=" + getId() + ", getBalance()=" + getBalance()
				+ ", getAnnualInterestRate()=" + getAnnualInterestRate() + ", getDateCreated()=" + getDateCreated()
				+ "]";
	}
}
