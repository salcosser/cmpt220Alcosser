//Sam Alcosser
// constructor file that puts together all  four of the functions
//Date updated: 1/30/19
//date due: 2/1/19
public class LabOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//simple math
		float val1 = (float) (((15.4*6.5)-(4.3*3.0)) / (46.3 - 3.5));
		System.out.println("Value 1 is equal to: " + val1);
		//calculator to calculate pi two different ways
		pi Value = new pi();
		System.out.println("pi can be computed two ways, either as: " + Value.piVal1() + "or as: "+ Value.piVal2());
		//simple ounces to gram converter that is a void method, meaning it doesn't really produce an output
		ounceToGram con = new ounceToGram();
		con.convert();
		// another void method to compute the energy of an object
		relative enLevel = new relative();
		enLevel.energy();
	}

}
