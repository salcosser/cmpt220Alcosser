//Sam Alcosser
//finding the energy of an object
//Date updated: 1/30/19
//date due: 2/1/19
import java.util.Scanner;

public class relative {
	public void energy() {
		Scanner input = new Scanner(System.in);
		//promt and input of the value of kg
		System.out.println("What is the mass of the object, in kilograms?");
		double kg = input.nextDouble();
		//assigning a value to c which is then used in the special relativity function
		double c = 299972458;
		double e = kg * Math.pow(c, 2);
		System.out.println("The energy of an object that has a mass of " + kg + " kilograms is "+ e);
	}
}
