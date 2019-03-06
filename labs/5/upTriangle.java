//Sam Alcosser
//3-5-19
//A square matrix is said to be an upper triangular matrix if the value of the cell is 0 when
//row > column. 

import java.util.Scanner;

public class upTriangle {

	public static void main(String[] args) {
//intaking the matrix
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What size of matrix do you want?");
		int size = input.nextInt();
		double[][] matrix = new double[size][size];
		//intake of values
	//taking the values
		for(int row = 0; row< matrix.length;row++) {
			for(int column = 0; column< matrix[row].length;column++) {
				System.out.println("row " + row + " column "+ column);
				matrix[row][column] = input.nextDouble();
			}
	}
		System.out.println("Is the matrix uppper triangular? " + isUpperTriangular(matrix));
	}
	//simple method to check if the matrix is upper triangular
	public static boolean isUpperTriangular(double[][] array) {
		for(int row = 0; row< array.length;row++) {
			for(int column = 0; column< array[row].length;column++) {
				if(row > column) {
					if(array[row][column] != 0) {
						return false;
					}
				}
			}
		
		}
		return true;
	}

}
