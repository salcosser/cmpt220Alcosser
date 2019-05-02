//Sam Alcosser
//5-1-19
public class SportCar implements Printable {
	//attributes
	public String make;
	public int modNum;
	//constructor
	public SportCar(String make, int modNum) {
		this.make = make;
		this.modNum = modNum;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("the " + make + " sport car has the model number of " + modNum);
	}

}
