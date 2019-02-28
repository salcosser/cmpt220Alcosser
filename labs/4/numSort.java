import java.util.Arrays;
import java.util.Scanner;

//Sam Alcosser
//2-20-19
//Write a program that will read a sequence of positive real numbers entered by the user
//and will print the same numbers in sorted order from smallest to largest. The user will
//input a zero to mark the end of the input. Assume that at most 100 positive numbers
//will be entered.
public class numSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] holder = new int[100];
		
		//taking in the number of the numbers and the numbers themselves
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers would you like to sort?");
		int n = input.nextInt();
		System.out.println("what are the numbers?");
		
		//inputing the numbers
		for(int i = 0; i<=n-1;i++) {
			holder[i] = input.nextInt();
		}	
		
		//weeding out the empty indexes
		int[] ending = new int[n];
		int innerInd = 0;
		for(int i=0;i<=99;i++) {
			if(holder[i] != 0) {
				ending[innerInd] = holder[i];
				innerInd++;
			}
		}
		input.close();
		
		//sorting and displaying the values
		Arrays.sort(ending);
		int count2 = 0;
		for(int i: ending) {
			System.out.println(i + "|" + count2);
			count2++;
		}
	}

}
