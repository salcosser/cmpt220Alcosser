//converting from ounces to grams
//Sam Alcosser
//Date updated: 1/30/19
//date due: 2/1/19
import java.util.Scanner;

public class ounceToGram {

	public void convert() {
		System.out.println("This program can help you convert from ounces to grams.");
		Scanner input = new Scanner(System.in);
		//prompt for the previously created scanner
		System.out.println("Please input the number of ounces");
		//input, quick calculation and output through the console
		double ounces = input.nextDouble();
		double grams = ounces * 28.3495;
		System.out.println(ounces + " ounces " + "is " + grams + " grams.");
	}
}
