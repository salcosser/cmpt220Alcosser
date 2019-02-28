import java.util.Scanner;

//Sam Alcosser
//2-20-19
//Create a Java class called MyString that has two methods with the following signatures:
//public static String reverse(String s)
//public static boolean isPalindrome(String s)
//The reverse method reverses a string. Use reverse to implement isPalindrome. A string
//is palindrome if the reverse is equal to the original string.
//Write a program that asks the user for a string and print sif the string is a palindrome or
//not.
public class MyString {
	public static void main(String[] args) {
		//formatting and user input
		Scanner input = new Scanner(System.in);
		System.out.println("What string would you like to reverse?");
		String inString = input.nextLine();
		System.out.println(reverse(inString));
		System.out.println("Also, is this a palindrome?");
		System.out.println(isPalindrome(inString));
	}
	//function which converts a string to its reverse
	public static String reverse(String s) {
		//setting up an array to hold the string as its made 
		char[] nString = new char[(int)s.length()];
		//used to keep track of where the character will be dropped in the new string
		int count = 0;
		//reverses string by putting the string in opposite order 
		for(int i = s.length() -1; i>=0; i--) {
			nString[count] = s.charAt(i);
			count++;
		}
		//converting array to string and returning
		String outStr = new String(nString);
		return outStr;
	}
	//since palindromes are just if the string is right back and forth, using the reverse function to reverse it, and then its just simply comparing both
	public static boolean isPalindrome(String s) {
		if(s.equals(reverse(s))) {
			return true;
		}else {
			return false;
		}
	}
}
