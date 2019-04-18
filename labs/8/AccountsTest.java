//Sam Alcosser
//4-17-19
//testing the account class and subclasses
public class AccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(98, 45376.0);
		CheckingAccount c = new CheckingAccount(54, 60045.0);
		SavingsAccount s = new SavingsAccount(97, 98735.0);
		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(s.toString());
	}

}
