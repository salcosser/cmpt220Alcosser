// Sam Alcosser
//2-6-2019
//comparing class

import java.util.Scanner;

public class compare {
	Integer a;
	Integer b;
	
	public void input() {
	Scanner input = new Scanner(System.in);
 	System.out.println("Enter integer A: ");
 	a = input.nextInt();
 	System.out.println("Enter integer B: ");
 	b = input.nextInt();
	}
	public void outTest() {
		System.out.print(a + b);
	}
	//less than
	public void lThan() {
		System.out.print(a + " is LESS THAN " + b + " ?");
		if(a < b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	//less than or equal
	public void lThanEqual() {
		System.out.print(a + " is LESS THAN OR EQUAL TO " + b + " ?");
		if (a <= b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	//equal to
	public void eqTo() {
		System.out.print(a + " is EQUAL TO " + b + " ?");
		if (a == b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	//not equal to
	public void nEqual() {
		System.out.print(a + " is NOT EQUAL TO " + b + " ?");
		if (a != b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	//greater than
	public void gThan() {
		System.out.print(a + " is GREATER THAN " + b + " ?");
		if (a > b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	//greater than or equal to
	public void gThanEqual() {
		System.out.print(a + " is GREATER THAN OR EQUAL TO " + b + " ?");
		if (a >= b) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
}
