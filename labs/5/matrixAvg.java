import java.util.Scanner;

//Sam Alosser
//3-5-19
//write a function that averages the values of the rows in a specific column

public class matrixAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting up to take in the matrix
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows do you want to have?");
		int rows = input.nextInt();
		System.out.println("How many columns do you want to have?");
		int cols = input.nextInt();
		double[][] matrix = new double[rows][cols];
		//intake of values
		for(int row = 0; row< matrix.length;row++) {
			for(int column = 0; column< matrix[row].length;column++) {
				System.out.println("row " + row + " column "+ column);
				matrix[row][column] = input.nextDouble();
			}
	}
		//taking the column to be averaged
		System.out.println("What column do you want to average?");
		int selCol = input.nextInt();
		System.out.println("The average of column "+ selCol + " is " + averageRow(matrix, selCol));
	}
	//simple average function which averages the column
	public static double averageRow(double[][] array, int column) {
		double sum = 0;
		for(int i = 0;i<array.length;i++) {
			sum+=array[i][column];
		}
		return sum / array.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
