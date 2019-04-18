//Sam Alcosser
//4/17/19
public class SavingsAccount extends Account {
//creating the superclass object to be referenced
	SavingsAccount(){
		super();
	}
	SavingsAccount(int id, double balance){
		super(id,balance);
	}
	//simple function that does not allow for the user to draw more money from the account than the balance would allow
	@Override
	public void withdraw(double amt) {
		if((this.getBalance() - amt) < 0) {
			System.out.println("Insufficient funds");
		}
		else {
			this.setBalance(this.getBalance() - amt);
		}
	}
	@Override
	public String toString() {
		return "SavingsAccount [getMonthlyInterestRate()=" + getMonthlyInterestRate() + ", getMonthlyInterest()="
				+ getMonthlyInterest() + ", getId()=" + getId() + ", getBalance()=" + getBalance()
				+ ", getAnnualInterestRate()=" + getAnnualInterestRate() + ", getDateCreated()=" + getDateCreated()
				+ ", getClass()=" + getClass() + "]";
	}
}
