//Sam Alcosser
//2-13-19
//Write a Java program that takes three numbers and prints the average. It should use a
//method with the following signature:
//public static double average(double a, double b, double c) 
public class findAvg {
	// simple main method implementing the average function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JA: Had to read the numbers from standard input
		System.out.print(average(33,4.3, 776));
	}
	// simple average function which takes three inputs as doubles and averages them, then returning the result
	public static double average(double a, double b, double c) {
		double avg = (a + b + c)/ 3;
		return avg;
	}
}
