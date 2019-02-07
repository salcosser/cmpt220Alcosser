import java.util.Scanner;
import java.util.Random;
//Write a Java program that asks the user for a lower limit integer, 
//and upper limit and prints three
//randomly generated integer values between the two limits. 
public class limits {
	
	public void randLim() {
		//explanation, and creation with use of the scanner for the base and ceiling
		System.out.println("finding a random number between two values:");
		Scanner input = new Scanner(System.in);
		System.out.println("enter the base integer");
		Integer base = input.nextInt();
		System.out.println("enter the ceiling integer");
		Integer ceil = input.nextInt();
		//make a random object to use the functions
		Random rand = new Random();
		//compute a random number between the ceil and the base
		int result = rand.nextInt(ceil-base) + base;
		System.out.println("random number between "+ base + " and "+ ceil + ": "+ result);
	}
	
	
}
