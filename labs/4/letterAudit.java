import java.util.Scanner;
//Sam Alcosser
//2-20-19
//Write a Java program that reads a string of text and prints the number of occurrences of
//each character that appears in the text. Do not count white spaces or special symbols. 
public class letterAudit {
// getting the wanted string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What string do you want to audit?");
		letterNumCounter(input.nextLine());
	}
	// function which checks the occurrence of every single number and letter
	public static void letterNumCounter(String s) {
		//all three for loops are the same, the only thing that changes  is the ranges
		//the ranges contain every number and alphabetical character
		for(int i = 48;i<= 57; i++) {
			char selChar = (char) i;
			if(s.indexOf(selChar) != -1) {
				auditSpec(s,selChar);
			}
		}
		for(int i = 65;i<= 90; i++) {
			char selChar = (char) i;
			if(s.indexOf(selChar) != -1) {
				auditSpec(s,selChar);
			}
		}
		for(int i = 97;i<= 122; i++) {
			char selChar = (char) i;
			if(s.indexOf(selChar) != -1) {
				auditSpec(s,selChar);
			}
		}
	}
	
	//this simple function checks the occurrences of any given character in any given string
	//by comparing every character in the string to the given character
		public static void auditSpec(String s, char c) {
			int letCount = 0;
			for(int i = 0;i < s.length();i++) {
				if(s.charAt(i) == c){
					letCount++;
				}
			}
			System.out.println("occurencess of " + c + " : " + letCount);
		}
}
