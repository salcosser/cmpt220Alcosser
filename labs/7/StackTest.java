//Sam Alcosser
//3-4-19
//stack testing class
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting the integer to be used from a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("enter an integer value");
		int num = input.nextInt();
		//making a new StackOfIntegers object
		StackOfIntegers stack = new StackOfIntegers();
		//finding the factors  and storing them in the (incorrect) order
		for(int i = 2;i<=num;i++) {
			while(num % i== 0) {
				stack.push(i);
				num = num/i;
			}
		
		}
		//printing out the factors in the correct order
		int size = stack.getSize();
		for(int i = 0;i<size;i++) {
			System.out.print(stack.pop()+ " ");
		}
	}
	
	
}
