//Sam Alcosser
//2-13-19
//Write a Java program to count the vowels in a string given as input. It should use a The
//program should use a method that takes the string and returns the count of the vowels.
import java.util.Scanner;

public class Vowels {
	//main method used for getting the desired string from the user and plugging it into the vowels function created below
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("What string do you want to count the vowels in?");
		System.out.println(vowels(input.next())); // JA: Need to use input.nextLine()
	}
	
	// function that counts the vowels by incrementing through the whole string and seeing if the indexed character is an a, e, i, o, or u, after being converted to lower case to keep things simple
	public static int vowels(String s){
		int count = 0;
		char currCh = 'a';
		for(int i = 0; i <= s.length() - 1; i++) {
			currCh = Character.toLowerCase(s.charAt(i));
			if( currCh == 'a' || currCh == 'e' || currCh == 'i' || currCh == 'o' || currCh == 'u') {
				count+=1;
			}
		}
		return count;
	}
}
