//Sam Alcosser
//3/5/19
//Write a method that finds the largest element in an array of double values with the
//following header:
//public static double max(double[] array)
//Write a program that prompts the user to enter 10 numbers, invokes this method to
//return the maximum value, and displays the maximum value. 

import java.util.Arrays;
import java.util.Scanner;

public class Biggest {
// accumulating the list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.println("Please input 10 numbers, and this program will find the biggest number");
		for(int i = 0;i<10;i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The largest number of that set is " + max(array) + ".");
	}
//simply using the sort function that comes with the arrays package	
	public static double max(double[] array) {
		int len = array.length;
		Arrays.sort(array);
		return array[len-1];
	}
}
