import java.util.Scanner;

//Write a Java program to calculate the mean and the standard deviation of a set of
//numbers. To compute the standard deviation with this formula, you must store the individual
//numbers using an array, so they can be used after the mean is obtained.
//Your program should contain the following methods:
//public static double deviation(double[] x)
//public static double mean(double[] x)
//Write a test program that prompts the user to enter 10 numbers and displays the mean
//and standard deviation.
public class stdDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] bigSet = new double[10];
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter 10 random numbers.");
		for(int i = 0;i<10;i++) {
			bigSet[i] = input.nextDouble();
		}
		System.out.println();
		System.out.printf("The average, or mean, of your 10 random numbers is: %5.2f ", mean(bigSet));
		System.out.println();
		System.out.printf("The standard deviation of your 10 random numbers is:  %5.2f", deviation(bigSet));
	}
	public static double deviation(double[] x) {
		double mean= mean(x);
		double meanHolder = 0;
		for(int i = 0;i<=x.length;i++) {
			meanHolder += (x[i] - mean) * (x[i] - mean);
			
		}
		return Math.sqrt(meanHolder /(x.length -1));
	}
	public static double mean(double[] x) {
		double sum = 0;
		for(double i : x) {
			sum+=i;
		}
		return (sum/x.length);
	}
}
