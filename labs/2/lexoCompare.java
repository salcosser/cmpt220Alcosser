import java.util.Scanner;

//Sam Alcosser
//2/7/19
//Write a Java program that prompts the user for two strings, 
//compares them lexicographically and
//outputs the string in ascending order. 
public class lexoCompare {

	public void compare() {
		System.out.println("This program is used to lexicographically compare two strings.");
		//creating the scanner
		Scanner input = new Scanner(System.in);
		
		// getting the first string
		System.out.println("First string: ");
		String string1 = input.nextLine();
		
		// getting the second string
		System.out.println("second string: ");
		String string2 = input.nextLine();
		
		//comparing the two strings, order is the difference in the two strings, a higher value means that the second string is "higher" than 
		// the first string, meaning that it is listed second alphabetically in more plain terms
		int order = string1.compareTo(string2);
		if (order <= 0) {
			System.out.println("the strings in correct lexicographical order are as follows: " + string1 + ", " +  string2 + ".");
		}else {
			System.out.println("the strings in correct lexicographical order are as follows: " + string2 + ", " +  string1 + ".");
		}
	}
	
}
