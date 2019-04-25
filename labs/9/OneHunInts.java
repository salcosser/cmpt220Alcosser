import java.util.ArrayList;
import java.util.Scanner;

//Sam Alcosser
//4-24-19
public class OneHunInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the list
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("creating a list of numbers");
		for(int i = 0;i<100;i++) {
			
			list.add((int) Math.round((Math.random()*(100))));
		}
		System.out.println("please give an index you would like to pull, preferrably between 0 and 99"); //getting user input
		int index = input.nextInt();
		try {
			System.out.println(list.get(index));	//tries to get that index, if not, it shows the exception as out of bounds
		}
		catch(Exception e) {
			System.out.println("Out of bounds");
		}
	}
}
