import java.util.Scanner;

//Sam Alcosser
//3-5-19
//. Write a Java program to transpose a matrix. The transpose of a matrix is a new matrix
//whose rows are the columns of the original matrix.
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intake of the size of the board and the values in it
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows do you want to have?");
		int rows = input.nextInt();
		System.out.println("How many columns do you want to have?");
		int cols = input.nextInt();
		int[][] board = new int[rows][cols];
		//intake of values
		for(int row = 0; row< board.length;row++) {
			for(int column = 0; column< board[row].length;column++) {
				System.out.println("row " + row + " column "+ column);
				board[row][column] = input.nextInt();
			}
	}
		//transposing the board and displaying it with a bit of formatting
		int[][] transposed = transpose(board);
		for(int row = 0; row< transposed.length;row++) {
			for(int column = 0; column< transposed[row].length;column++) {
				System.out.print(transposed[row][column] + " | ");
			}
			System.out.println();
		}
 	}
	//simple function that just takes the column and row of each values, swaps the two indexes and places it in that place in a new matrix
	public static int[][] transpose(int[][] matrix){
		int rowLn = matrix.length;
		int colLn = matrix[0].length;
		int[][] newMat = new int[rowLn][colLn];
		for(int row = 0; row< matrix.length;row++) {
			for(int column = 0; column< matrix[row].length;column++) {
				newMat[row][column] = matrix[column][row];
			}
			
		}
		return newMat;
	}
}
