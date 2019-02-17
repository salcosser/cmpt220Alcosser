//Sam Alcosser
//2-13-19
//Write a Java program that prints the first 50 pentagonal numbers (10 per line). The
//program should use a method that takes an integer value n and prints the nth
//pentagonal number. 
public class pentagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable keeping track of the line
		int lineCount = 0;
	//loop which applies the pentagonal number function to every number from 0 to 50, and keeps each line to 10 answers
	for(int i = 0;i<50;i++) {
		if(lineCount >=10) {
			System.out.println("");
			lineCount = 0;
		}
		System.out.print(pentFunc(i) + ", ");
		lineCount++;
	}
	}
	//the mathematical formula for finding pentagonal numbers converted into java code
	public static double pentFunc(int n) {
		double pentNum = (3 * Math.pow( n, 2) - n)/2; // JA
		return pentNum;
	}
}
