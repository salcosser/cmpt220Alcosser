//Sam Alcosser
//2-13-19
//Write a Java program that prints the characters corresponding to the ASCII codes 1 to
//100. Print 20 characters per line.
public class ascii {
	public static void main(String[] args) {
		//line count variable
		Integer lineCount = 0;
		for(int i = 50; i <= 100; i++ ) {
			//keeping track of the line count
			if(lineCount >= 20) {
				System.out.println();
				lineCount = 0;
			}
			//converting the integer, or ASCII value to a char value and printing it
			System.out.print((char)i);
			lineCount++;
		}
	
	}
}
