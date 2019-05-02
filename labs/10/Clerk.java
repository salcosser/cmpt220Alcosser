//Sam Alcosser
//5-1-19
public class Clerk extends Employee {

	//constructor
	public Clerk(String name, int age, int hourRate) {
		super(name, age, hourRate);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double salary(double hours) {
		// TODO Auto-generated method stub
		return hours * 13; //custom salary
	}

}
