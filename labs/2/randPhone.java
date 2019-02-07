//Sam Alcosser
//2/7/19
//Write a Java program that generates and prints a 
//random phone number every time the program is
//executed. The number should be formatted as (xxx) xxx-xxxx. 
//The phone number may not start with 0 or 1. 
public class randPhone {

	public void phoney() {
		// making the first number and using a while loop to ensure it isn't a 1 or a 0
		int num1 = (int) (Math.random()* 10);
		while(num1 <=1) {
			num1 = (int) (Math.random()* 10);
		}
		//creating a string to hold the number so that it can be called by substrings
		String fullNum = Integer.toString(num1);
		//for loop to randomly generate 9 other numbers and concatenate them to the fullNum string
		for(int i = 0;i<9;i++) {
			int nextNum = (int) (Math.random()* 10);
			String numSend = Integer.toString(nextNum);
			//made sure to not only concatenate the strings, but save them to the variable
			fullNum = fullNum.concat(numSend);
		}
		//print statement utilizing the substring function to pull the three sets of numbers
		System.out.print("(" + fullNum.substring(0,3) + ") - "+ fullNum.substring(3,6)+ " - "+ fullNum.substring(6));
	}
}
