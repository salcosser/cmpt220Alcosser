//Sam Alcosser
//5-1-19
public class Manager extends Employee {
	//constructor that sends to the super
	public Manager(String name, int age, int hourRate) {
		super(name, age, hourRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salary(double hours) {
		// TODO Auto-generated method stub
		return hours * 40; //custom salary
	}

}
