//Sam Alcosser
//2-13-19
//Write a Java program that prints all the numbers from 100 to 500 (10 per line) that are
//divisible by 5 or 7 but not both. Separate each number with a white space.
public class fiveSeven {
	public static void main(String[] args) {
		//using a variable to keep track of the number of ints per line
		Integer lineCount = 0;
		// using a loop which both keeps track of the 10 number limit and if the number is divisible by either 5 or 7, but not both
		for(int n = 100; n <= 500; n++) {
			//line checking
			if(lineCount >= 10)	{	
				System.out.println(" ");
				lineCount = 0;
			}
			//either or, but not both 5 and 7
			if(n % 7 == 0 ^ n % 5 == 0) {
				System.out.print(n + " ");
				lineCount += 1;
			}
		}
	}

}
