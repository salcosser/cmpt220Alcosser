import java.util.Random;

//Sam Alcosser
//2/19/19
//Write a Java program that prints a 5 by 5 matrix of randomly generated lower case
//letters.
public class theMatrix {
//main method which is mainly functioning to format the random characters correctly
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------");
		//five rows
		for(int i = 0;i< 5; i++) {
			System.out.print("|");
			//each row has 5 charachters
			for(int n = 1;n<= 5;n++) {
				//call the random character function
				System.out.print(randChar() + "|");
			}
			System.out.println("");
			System.out.println("--------------");
		}
	}
	//function which converts a random number within the limits of the ascii values that equate to lower case numbers and returns a character
	public static char randChar() {
		
		int randIn = (int) ((int) 97.0 + (double)(Math.random() * ((122.0 - 97.0) + 1)));
		char ranChar =(char) randIn ;
		return ranChar;
	}
}
