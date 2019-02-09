import java.util.Scanner;

// Sam Alcosser
//2-6-2019
//Write a Java program that prompts the user to enter two characters, 
//adds them up and prints the integer value of the result. 

// JA: You are missing the main method
public class charToNum {
	public void convert() {
		//making the scanner
		Scanner input = new Scanner(System.in);
		
		//converting the first character
		System.out.print("input a charachter");
		String char1 = input.next();
		char charOne = char1.charAt(0);
		int charVal=Character.getNumericValue(charOne);
		
		//converting the second character
		System.out.print("input a second charachter");
		String char2 = input.next();
		char charTwo = char2.charAt(0);
		int charVal2=Character.getNumericValue(charTwo);
		
		//adding them up
		System.out.println("The value of both charachters is " + (charVal + charVal2));
	}
}
