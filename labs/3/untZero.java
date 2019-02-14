//Sam Alcosser
//2-13-19
//1. Write a Java program that reads a sequence of positive integers (it reads until the user
//enters a 0) and outputs the number of even numbers, the sum of the numbers as well as
//the average. 

import java.util.Scanner;

public class untZero {
	
	public static void main(String[] args) {
		//making the scanner
		Scanner input = new Scanner(System.in);
		
		//declaring all of the variables needed to keep track of
		Integer count = 0;
		Integer sum = 0;
		Integer evCount = 0;
		
		//prompting for the first
		System.out.println("Whats the first number?");
		Integer currNum = input.nextInt();
		
		//while loop to handle the different numbers coming in by counting the numbers, and totaling them into the sum variable while using an if statement to catch all even numbers
		while(currNum != 0) {
			count += 1;
			sum += currNum;
			if(currNum % 2 == 0) {
				evCount += 1;
			}
			System.out.println("Whats the next number?");
			currNum = input.nextInt();
		}
		// number processing for the average
		double avg = sum / count;
		System.out.print("the amount of numbers that are even is: " + evCount + "\n" + "The total sum is: " + sum  +  "\n" + "The average of all of the numbers is: " + avg);
	}
}
