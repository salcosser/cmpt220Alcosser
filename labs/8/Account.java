import java.util.Date;

//Sam Alcosser
//4/17/19
//class that is meant to keep track of accounts as a super class
public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//no arg constructor
	Account(){
		
	}
	// arg constructor
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	//simply divides annual by 12 to find monthly
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	
	//simple function to find monthly interest
	public double getMonthlyInterest() {
		return this.balance * this.getMonthlyInterestRate();
	}
	//allows for user to add to the account
	public void deposit(double amount) {
		this.balance = this.balance+ amount;
	}
	//setters and getters for attributes
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	void withdraw(double amt) {
		this.balance = this.balance - amt;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}

	
}

