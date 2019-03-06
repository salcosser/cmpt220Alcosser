//Sam Alcosser
//3-5-19
//Write a Java program that takes the number of students from the user, for each student
//it will take the name and the score. Print a sorted list of the students and the scores in
//ascending order by score
import java.util.Arrays;
import java.util.Scanner;

public class studScores {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//accumulating the names and showing the inputs
		String[][] studentList = intake(3);
		System.out.println("Before Sorting");
		for(int row = 0; row< studentList.length;row++) {
			for(int column = 0; column< studentList[row].length;column++) {
				System.out.println(studentList[row][column] + " ");
			}
		}
		//sorting using the method created
		sorter(studentList);
		//showing the results of the sorting
		System.out.println("---------------------");
		System.out.println("After Sorting");
		for(int row = 0; row< studentList.length;row++) {
			for(int column = 0; column< studentList[row].length;column++) {
				System.out.println(studentList[row][column] + " ");
			}
		}
	}
	//method which takes in both the names and the scores as strings, to further be computed by the sorting method
	public static String[][] intake(int studentAmt){
		int n = studentAmt;
		String[][] students = new String[n][2];
		Scanner input1 = new Scanner(System.in);
		for(int i =0;i<n;i++) {
			System.out.println("Student name " + (i+1));
			students[i][0] = input1.nextLine();
			System.out.println("Student score " + (i+1));
			students[i][1] = input1.nextLine();
		}
		return students;
	}
	//method that alters the inputed string multidimensional array and sorts by score in ascending order
	public static String[][] sorter(String[][] scoresMatrix){
		//getting the first value place
		for(int i = 0;i<scoresMatrix.length;i++) {
			//checking every value place against the selected place
			for(int n = i+1;n<scoresMatrix.length;n++) {
				//using the parseInt() function to compare the values of the strings as integers
				//if the one before is bigger than the further one, then both the names and the values will be swapped
				if(Integer.parseInt(scoresMatrix[i][1]) >Integer.parseInt(scoresMatrix[n][1])) {
					String temp = scoresMatrix[n][1];
					scoresMatrix[n][1]= scoresMatrix[i][1];
					scoresMatrix[i][1] = temp;
					String temp1 = scoresMatrix[n][0];
					scoresMatrix[n][0]= scoresMatrix[i][0];
					scoresMatrix[i][0] = temp1;
				}
			}
		}
		return scoresMatrix;
	}
	
}
